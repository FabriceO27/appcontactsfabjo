package applicontactsfabjo.services;

import java.util.List;

// Creation de la classe PersonneServices

import javax.ejb.*;

import applicontactsfabjo.dao.PersonneDAO;
import applicontactsfabjo.entities.Adresse;
import applicontactsfabjo.entities.Personne;

@Singleton
public class PersonneServices {

	@EJB
	private PersonneDAO dao;

	public List<Personne> findPersonnes() {
		return dao.findPersonnes();
	}

	public List<Personne> findPersonneById(int pk) {
		return dao.findPersonneById(pk);

	}

	public void addPersonne(Personne personne) {
		dao.addPersonne(personne);

	}

	public void updatePersonne(Personne personne, Adresse adresse) {
		dao.updatePersonne(personne, adresse);

	}
}
