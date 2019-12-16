package applicontactsfabjo.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import applicontactsfabjo.entities.Personne;

public class PersonneDAO {

	@Singleton
	public class PersonneServices {

		@PersistenceContext(name = "contacts")
		private EntityManager em;

		public List<Personne> findPersonnes() {
			return em.createNamedQuery("", Personne.class).getResultList();
		}

		public List<Personne> findPersonneById(int pk) {
			return em.createNamedQuery("", Personne.class).setParameter("pk", pk).getResultList();

		}

		public void addPersonne(Personne personne) {
//em.createStoredProcedureQuery("",personne.Class().
		}

	}
}
