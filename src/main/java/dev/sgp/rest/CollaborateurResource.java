package dev.sgp.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@Path("/collaborateurs")
public class CollaborateurResource {
	
	@EJB CollaborateurService collabService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Collaborateur> list() {
		return collabService.listerCollaborateurs();
	}
	
	@GET
	@Path("/{matricule}")
	@Produces(MediaType.APPLICATION_JSON)
	public Collaborateur find(@PathParam("matricule") String matricule) {
		return collabService.findByMatricule(matricule);
	}
	
	@PUT
	@Path("/{matricule}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Collaborateur update(@PathParam("matricule") String matricule, Collaborateur collab) {
		return collabService.updateCollaborateur(matricule, collab);
	}
}
