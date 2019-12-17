package applicontactsfabjo.services;

import java.util.List;

// Creation de la classe PersonneServices

import javax.ejb.*;

import applicontactsfabjo.dao.PersonneDAO;
import applicontactsfabjo.entities.Adresse;
import applicontactsfabjo.entities.Personne;

/**Classe de la couche service communiquant avec la couche presentation et la couche persistance
 * @author Adminl
 *
 */
@Singleton
public class PersonneServices {

	@EJB
	private PersonneDAO dao;

	/** Permet de trouver toutes les personnes de la BDD
	 * @return
	 */
	public List<Personne> findPersonnes() {
		return dao.findPersonnes();
	}

	/**Permet de retourner une personne correspondante au pk d'entrée
	 * @param pk
	 * @return
	 */
	public List<Personne> findPersonneById(int pk) {
		return dao.findPersonneById(pk);

	}

	/**permet d'ajouter un nouveau contact
	 * @param personne
	 */
	public void addPersonne(Personne personne) {
		dao.addPersonne(personne);

	}

	/**permet de mettre à jour un contact, cette methode n'est pas encore foncitonnelle
	 * @param personne
	 * @param adresse
	 */
	public void updatePersonne(Personne personne, Adresse adresse) {
		dao.updatePersonne(personne, adresse);

	}
}
