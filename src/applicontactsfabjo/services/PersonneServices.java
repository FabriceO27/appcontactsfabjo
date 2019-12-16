package applicontactsfabjo.services;

import java.util.List;

// Creation de la classe PersonneServices

import javax.ejb.*;
import javax.persistence.*;

import applicontactsfabjo.entities.Personne;

@Singleton
public class PersonneServices {
	
@PersistenceContext(name = "contacts")
private EntityManager em;

public List<Personne> findPersonnes(){
	return null;
	}



}
