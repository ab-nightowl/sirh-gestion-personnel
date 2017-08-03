package dev.sgp.web.listener;

import java.time.LocalDate;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@WebListener
public class DemarrageApplicationListener implements ServletContextListener {

	// récupération du service
	@Inject private CollaborateurService collabService;
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		Collaborateur collab1 = new Collaborateur("Dupont", "A", LocalDate.now(), "Bordeaux", "1170833891012345");
		Collaborateur collab2 = new Collaborateur("Martin", "A", LocalDate.now(), "Nantes", "1170844891012345");
		Collaborateur collab3 = new Collaborateur("Dupont", "B", LocalDate.now(), "Lille", "1170862891012345");
		Collaborateur collab4 = new Collaborateur("Martin", "B", LocalDate.now(), "Montpellier", "1170834891012345");
		Collaborateur collab5 = new Collaborateur("Bernard", "A", LocalDate.now(), "Lyon", "1170869891012345");
		Collaborateur collab6 = new Collaborateur("Bernard", "B", LocalDate.now(), "Nancy", "1170854891012345");
		
		collabService.sauvegarderCollaborateur(collab1);
		collabService.sauvegarderCollaborateur(collab2);
		collabService.sauvegarderCollaborateur(collab3);
		collabService.sauvegarderCollaborateur(collab4);
		collabService.sauvegarderCollaborateur(collab5);
		collabService.sauvegarderCollaborateur(collab6);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {}
	
}
