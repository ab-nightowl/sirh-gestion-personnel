package dev.sgp.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dev.sgp.entite.Departement;

@Stateless
public class DepartementService {
	
	@PersistenceContext(unitName="sgp-pu") private EntityManager em;
	
	public void sauvegarderDepartement(Departement departement) {
		em.persist(departement);
	}

	public List<Departement> listerDepartements() {
		return em.createNamedQuery("departements.findAllDepartements",
				Departement.class)
				.getResultList();
	}

	public Departement getDepartementById(int idDepartement) {
		return em.createNamedQuery("departements.getDepartementById",
				Departement.class)
				.setParameter("id", idDepartement)
				.getSingleResult();
	}
}
