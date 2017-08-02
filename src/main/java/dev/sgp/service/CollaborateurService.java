package dev.sgp.service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import dev.sgp.entite.Collaborateur;

public class CollaborateurService {

	List<Collaborateur> listeCollaborateurs = new ArrayList<>();

	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
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
		
		listeCollaborateurs.add(collab);
	}
	
	
}
