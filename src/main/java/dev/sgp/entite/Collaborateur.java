package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="collaborateurs")
public class Collaborateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numeroSecu;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif;
	
	
	public Collaborateur() {}

	public Collaborateur(String matricule, String nom, String prenom, LocalDate dateDeNaissance, String adresse,
			String numeroSecu, String emailPro, String photo) {
		this.id = id;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numeroSecu = numeroSecu;
		this.emailPro = emailPro;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumeroSecu() {
		return numeroSecu;
	}

	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	
	
}
