package applicontactsfabjo.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import applicontactsfabjo.dao.AdresseDao;
import applicontactsfabjo.entities.Adresse;

@Singleton
public class AdresseServices {

	@EJB
	private AdresseDao dao;
	
	public List<Adresse> findAdresses(){
		return dao.findAdresses();
	}
	
	public List<Adresse> findAdresseByPk(int pk){
		return dao.findAdresseByPk(pk);
	}
	
	public void addAdresse(Adresse adresse) {
		dao.addAdresse(adresse);
	}
	
	public void updateAdresse(Adresse adresse, int pk) {
		dao.updateAdresse(adresse, pk);
	}
	
	public void deleteAdresse(int pk) {
		dao.deleteAdresse(pk);
	}
}
