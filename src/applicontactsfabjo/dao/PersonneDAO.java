package applicontactsfabjo.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import applicontactsfabjo.entities.Adresse;
import applicontactsfabjo.entities.Personne;

@Singleton
public class PersonneDAO {

	@PersistenceContext(name = "contacts")
	private EntityManager em;

	public List<Personne> findPersonnes() {
		return em.createNamedQuery("personne.findPersonne", Personne.class).getResultList();
	}

	public List<Personne> findPersonneById(int pk) {
		return em.createNamedQuery("personne.findPersonneById", Personne.class).setParameter("pk", pk).getResultList();

	}

	public void addPersonne(Personne personne) {
		em.persist(personne);
	}

	public void updatePersonne(Personne personne, Adresse adresse) {
		em.merge(adresse);
		em.merge(personne);
	}
}
