package dev.sgp.entite;

import javax.persistence.*;

@Entity
@Table(name="departements")
@NamedQueries({
@NamedQuery(name="departements.findAllDepartements", query="select d from Departement d"),
@NamedQuery(name="departements.getDepartementById", query="select d from Departement d where d.id=:id")
})
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nom;
	
	public Departement(Integer id, String nom) {
		this.id = id;
		this.nom = nom;
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
	
	
}
