package dev.sgp.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.CollabEvt;

@Stateless
public class ActiviteService {
	
	@PersistenceContext(unitName="sgp-pu") private EntityManager em;
	
	public void recevoirEvenementCollab(@Observes CollabEvt evt) {
		if (evt != null) {
			em.persist(evt);
		}
	}
	
	public List<CollabEvt> listerActivitesCollab() {
		String sql = "select evt from CollabEvt evt";
		TypedQuery<CollabEvt> query = em.createQuery(sql, CollabEvt.class);
		return query.getResultList();
	}
	
	
}
