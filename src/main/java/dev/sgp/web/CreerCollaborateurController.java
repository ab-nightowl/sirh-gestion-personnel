package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@WebServlet("/collaborateurs/creer")
public class CreerCollaborateurController extends HttpServlet {
	
	// récupération du service
	@Inject private CollaborateurService collabService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
		
	}
			
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		String dateDeNaissanceParam = req.getParameter("date-de-naissance");
		String adresseParam = req.getParameter("adresse");
		String numeroSecuParam = req.getParameter("numeroSecu");
		
		resp.setContentType("text/html");
		
		List<String> paramsNull = Stream.of("nom", "prenom", "dateDeNaissance", "adresse", "numeroSecu").filter(p -> req.getParameter(p) == null).collect(Collectors.toList());
		
		if (paramsNull.isEmpty() && numeroSecuParam.length() == 15) {
			resp.setStatus(201);
			resp.getWriter().write("Création d’un collaborateur avec les informations suivantes : " 
					+ "nom=" + nomParam 
					+ ", prenom=" + prenomParam
					+ ", dateDeNaissance=" + dateDeNaissanceParam
					+ ", adresse=" + adresseParam
					+ ", numeroSecu=" + numeroSecuParam
					);
		} else {
			resp.setStatus(400);
			resp.getWriter().write(
					"Les paramètres suivants sont incorrects : " + String.join(", ", paramsNull));
		}
		
		String nom = nomParam;
		String prenom = prenomParam;
		LocalDate dateDeNaissance = LocalDate.parse(dateDeNaissanceParam);
		String adresse = adresseParam;
		String numeroSecu = numeroSecuParam;
		
		
		Collaborateur collab = new Collaborateur(nom, prenom, dateDeNaissance, adresse, numeroSecu);
		
		collabService.sauvegarderCollaborateur(collab);
		
		resp.sendRedirect("lister");
	}
	
	
}
