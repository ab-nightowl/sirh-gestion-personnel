package dev.sgp.service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.CollabEvt;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.TypeCollabEvt;

@Stateless
public class CollaborateurService {

	@PersistenceContext(unitName="sgp-pu") private EntityManager em;
	
	@Inject Event<CollabEvt> collabEvt;
	
	public List<Collaborateur> listerCollaborateurs() {
		String sql = "select c from Collaborateur c";
		TypedQuery<Collaborateur> query = em.createQuery(sql, Collaborateur.class);
		return query.getResultList();
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		String matricule = UUID.randomUUID().toString();
		StringBuilder stringBuilder = new StringBuilder();
		String emailPro = stringBuilder.append(collab.getPrenom()).append(".").append(collab.getNom()).append("@").append("societe.com").toString();
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();
		Boolean actif = true;
		String photo = "https://upload.wikimedia.org/wikipedia/commons/7/7c/Profile_avatar_placeholder_large.png";
		
		collab.setMatricule(matricule);
		collab.setEmailPro(emailPro);
		collab.setDateHeureCreation(dateHeureCreation);
		collab.setActif(actif);
		collab.setPhoto(photo);
		
		em.persist(collab);
		
		collabEvt.fire(new CollabEvt(dateHeureCreation, TypeCollabEvt.CREATION_COLLAB, matricule)); // déclenche un nouvel événement
		
	}
	
	
}
