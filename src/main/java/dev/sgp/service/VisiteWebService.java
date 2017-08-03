package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.CollabEvt;
import dev.sgp.entite.VisiteWeb;

@Stateless
public class VisiteWebService {
	
	@PersistenceContext(unitName="sgp-pu") private EntityManager em;
	
	public VisiteWebService() {
		
	}

	public List<VisiteWeb> listerVisites() {
		String sql = "select v from VisiteWeb v";
		TypedQuery<VisiteWeb> query = em.createQuery(sql, VisiteWeb.class);
		return query.getResultList();
	}
	
	public void sauvegarderVisite(VisiteWeb visite) {
		em.persist(visite);
	}
	
	public Map<String, List<VisiteWeb>> filtrerVisites() {
		String sql = "select v from VisiteWeb v";
		TypedQuery<VisiteWeb> query = em.createQuery(sql, VisiteWeb.class);
		List<VisiteWeb> visites = query.getResultList();
		
		Map<String, List<VisiteWeb>> visitesFiltrees = visites.stream().collect(Collectors.groupingBy(VisiteWeb::getChemin));
		
		return visitesFiltrees;
	}
	
}
