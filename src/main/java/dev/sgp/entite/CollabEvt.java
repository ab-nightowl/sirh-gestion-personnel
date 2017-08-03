package dev.sgp.entite;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="collab_events")
public class CollabEvt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private ZonedDateTime dateHeure;
	private TypeCollabEvt type;
	private String matricule;
	
	public CollabEvt() {}

	public CollabEvt(ZonedDateTime dateHeure, TypeCollabEvt type, String matricule) {
		this.dateHeure = dateHeure;
		this.type = type;
		this.matricule = matricule;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public ZonedDateTime getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(ZonedDateTime dateHeure) {
		this.dateHeure = dateHeure;
	}

	public TypeCollabEvt getType() {
		return type;
	}

	public void setType(TypeCollabEvt type) {
		this.type = type;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
}
