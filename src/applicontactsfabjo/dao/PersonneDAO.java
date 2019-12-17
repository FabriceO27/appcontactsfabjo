package applicontactsfabjo.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import applicontactsfabjo.entities.Adresse;
import applicontactsfabjo.entities.Personne;

/**classe permettant de communiquer avec le BDD en faisant transiter des personnes
 * @author Adminl
 *
 */
@Singleton
public class PersonneDAO {

	@PersistenceContext(name = "contacts")
	private EntityManager em;

	/**permet de chercher toutes les personnes de la BDD pour l'ecran d'accueil
	 * @return
	 */
	public List<Personne> findPersonnes() {
		return em.createNamedQuery("personne.findPersonne", Personne.class).getResultList();
	}

	/**permet de chercher la personne correspondant au pk entré pour l'afficher sur l'écran afficher contact
	 * @param pk
	 * @return
	 */
	public List<Personne> findPersonneById(int pk) {
		return em.createNamedQuery("personne.findPersonneById", Personne.class).setParameter("pk", pk).getResultList();

	}

	/**permet d'ajouter une personne et son adresse, utilisé pour l'écran créer contact
	 * @param personne
	 */
	public void addPersonne(Personne personne) {
		em.persist(personne);
	}

	/**methode permettant de mettre à jour un contact dans la BDD, non fonctionnel
	 * @param personne
	 * @param adresse
	 */
	public void updatePersonne(Personne personne, Adresse adresse) {
		em.merge(adresse);
		em.merge(personne);
	}
}
