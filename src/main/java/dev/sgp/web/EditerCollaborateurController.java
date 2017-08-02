package dev.sgp.web;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/collaborateurs/editer")
public class EditerCollaborateurController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String matriculeParam = req.getParameter("matricule");
		resp.setContentType("text/html");
		
		if (matriculeParam == null) {
			resp.sendError(400, "Un matricule est attendu");
		} else {
			// code HTML écrit dans le corps de la réponse
			resp.getWriter().write(
				"<h1>Editer collaborateurs</h1>"
				+ "<ul>"
				+ "<li>matricule="+ matriculeParam + "</li>"
				+ "</ul>");
		}
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		resp.setContentType("text/html");
		
		List<String> paramsNull = Stream.of("matricule", "titre", "nom", "prenom").filter(p -> req.getParameter(p) == null).collect(Collectors.toList());
		
		if (paramsNull.isEmpty()) {
			resp.setStatus(201);
			resp.getWriter().write("Création d’un collaborateur avec les informations suivantes : matricule=" 
					+ matriculeParam 
					+ ", titre=" + titreParam 
					+ ", nom=" + nomParam 
					+ ", prenom=" + prenomParam);
		} else {
			resp.getWriter().write(
					"Les paramètres suivants sont incorrects : " + String.join(", ", paramsNull));
		}	
	}
	
	
}
