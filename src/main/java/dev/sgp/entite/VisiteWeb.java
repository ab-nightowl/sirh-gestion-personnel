package dev.sgp.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visites_web")
public class VisiteWeb {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String chemin;
	private Integer tempsExecution;
	
	public VisiteWeb() {}

	public VisiteWeb(Integer id, String chemin, Integer tempsExecution) {
		this.id = id;
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public Integer getTempsExecution() {
		return tempsExecution;
	}

	public void setTempsExecution(Integer tempsExecution) {
		this.tempsExecution = tempsExecution;
	}
	
	
}
