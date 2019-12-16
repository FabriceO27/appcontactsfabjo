package applicontactsfabjo.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "personnes")
@Access(AccessType.FIELD)
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk;
	private String civilite;
	private String nom;
	private String prenom;
	private List<String> adresse;
	private String surnom;
//	public Avatar pp;

	/**
	 * Constructeur de personne a 6 attributs
	 * 
	 * @param pk,      pk pour "Primary Key", la cl� primaire pour la base de
	 *                 donn�es
	 * @param civilite
	 * @param nom
	 * @param prenom
	 * @param adresse, qui est une liste d'attributs
	 * @param surnom
	 */

	public Personne(int pk, String civilite, String nom, String prenom, List<String> adresse, String surnom) {
		super();
		this.pk = pk;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.surnom = surnom;
	}

	public Personne() {
		super();
	}

	/**
	 * Getters and Setters
	 */

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<String> getAdresse() {
		return adresse;
	}

	public void setAdresse(List<String> adresse) {
		this.adresse = adresse;
	}

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

}
