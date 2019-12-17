package applicontactsfabjo.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import applicontactsfabjo.entities.Adresse;

/**classe sans utilité pour le moment, permettra de faire communiquer avec la BDD
 * @author Adminl
 *
 */
@Singleton
public class AdresseDao {

	@PersistenceContext(name = "contacts")
	private EntityManager em;

	public List<Adresse> findAdresses() {
		return em.createNamedQuery("adresse.findAdresse", Adresse.class).getResultList();
	}

	public List<Adresse> findAdresseByPk(int pk) {
		return em.createNamedQuery("adresse.findAdresseByPk", Adresse.class).setParameter("pk", pk).getResultList();
	}

	public void addAdresse(Adresse adresse) {
		em.persist(adresse);
	}

	public void updateAdresse(Adresse adresse) {
		em.merge(adresse);
	}

	public void deleteAdresse(int pk) {
		Adresse address = em.find(Adresse.class, pk);

		em.getTransaction().begin();
		em.remove(address);
		em.getTransaction().commit();
	}
}
