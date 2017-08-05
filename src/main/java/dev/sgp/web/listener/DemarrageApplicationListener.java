package dev.sgp.web.listener;

import java.time.LocalDate;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;

@WebListener
public class DemarrageApplicationListener implements ServletContextListener {

	// récupération des services
	@EJB private CollaborateurService collabService;
	@EJB private DepartementService dps;
	
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		dps.sauvegarderDepartement(new Departement(null, "Comptabilité"));
		dps.sauvegarderDepartement(new Departement(null, "Ressources Humaines"));
		dps.sauvegarderDepartement(new Departement(null, "Informatique"));
		dps.sauvegarderDepartement(new Departement(null, "Administratif"));

		Collaborateur collab1 = new Collaborateur(null, "Dupont", "A", LocalDate.now(), "Bordeaux", "1170833891012345", null, null, "Expert Comptable", dps.getDepartementById(0));
		Collaborateur collab2 = new Collaborateur(null, "Martin", "A", LocalDate.now(), "Nantes", "1170844891012345", null, null, "DRH", dps.getDepartementById(1));
		Collaborateur collab3 = new Collaborateur(null, "Dupont", "B", LocalDate.now(), "Lille", "1170862891012345", null, null, "Chef de projet", dps.getDepartementById(2));
		Collaborateur collab4 = new Collaborateur(null, "Martin", "B", LocalDate.now(), "Montpellier", "1170834891012345", null, null, "Assistant d'administration", dps.getDepartementById(3));
		Collaborateur collab5 = new Collaborateur(null, "Bernard", "A", LocalDate.now(), "Lyon", "1170869891012345", null, null, "Administrateur réseau", dps.getDepartementById(2));
		Collaborateur collab6 = new Collaborateur(null, "Bernard", "B", LocalDate.now(), "Nancy", "1170854891012345", null, null, "Développeur Java EE", dps.getDepartementById(2));
		
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
