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

@WebServlet("/collaborateurs/editer")
public class EditerCollaborateurController extends HttpServlet {

	@Inject
	private CollaborateurService collabService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String matriculeParam = req.getParameter("matricule");
		resp.setContentType("text/html");

		if (matriculeParam == null) {
			resp.sendError(400, "Un matricule est attendu");
		} else {
			req.setAttribute("matricule", matriculeParam);
			
			Collaborateur collab = collabService.findByMatricule(matriculeParam);
			req.setAttribute("collab", collab);
			
			req.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String matricule = req.getParameter("matricule");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");

		String dateDeNaissanceParam = req.getParameter("date-de-naissance");
		LocalDate dateDeNaissance = LocalDate.parse(dateDeNaissanceParam);

		String adresse = req.getParameter("adresse");
		String numeroSecu = req.getParameter("num-secu");
		String emailPro = req.getParameter("email-pro");
		String photo = req.getParameter("photo");

		resp.setContentType("text/html");

		List<String> paramsNull = Stream.of("matricule").filter(p -> req.getParameter(p) == null)
				.collect(Collectors.toList());

		if (paramsNull.isEmpty()) {
			resp.setStatus(201);
			resp.getWriter().write("Mis à jour du collaborateur avec les informations suivantes : " + "email pro="
					+ emailPro + ", photo=" + photo);
		}

		collabService.updateCollaborateur(
				matricule, new Collaborateur(matricule, nom, prenom, dateDeNaissance, adresse, numeroSecu, emailPro, photo, null, null));

		resp.sendRedirect("lister");
	}

}
