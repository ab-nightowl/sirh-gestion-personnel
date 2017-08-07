package dev.sgp.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.sgp.entite.Departement;
import dev.sgp.service.DepartementService;

@Path("/departements")
public class DepartementResource {
	
	@EJB DepartementService dps;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Departement> list() {
		return dps.listerDepartements();
	}
	
	@GET
	@Path("/{idDepartement}")
	@Produces(MediaType.APPLICATION_JSON)
	public Departement listCollaborateursByDepartement(@PathParam("idDepartement") Integer idDepartement) {
	Departement departementById = dps.getDepartementById(idDepartement);
	return departementById;
	}
}
