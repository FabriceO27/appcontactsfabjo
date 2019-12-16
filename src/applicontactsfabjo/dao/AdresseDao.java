package applicontactsfabjo.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import applicontactsfabjo.entities.Adresse;

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

	public void updateAdresse(Adresse adresse, int pk) {
		Adresse address = em.find(Adresse.class, pk);

		em.getTransaction().begin();
		address = new Adresse(adresse.getVoie(), adresse.getCodePostal(), adresse.getVille(), adresse.getPays());
		em.getTransaction().commit();
	}

	public void deleteAdresse(int pk) {
		Adresse address = em.find(Adresse.class, pk);

		em.getTransaction().begin();
		em.remove(address);
		em.getTransaction().commit();
	}
}
