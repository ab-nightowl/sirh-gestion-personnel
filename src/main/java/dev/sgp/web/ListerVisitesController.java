package dev.sgp.web;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingInt;

import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

@WebServlet("/statistiques")
public class ListerVisitesController extends HttpServlet {
	
	// récupération du service
	private VisiteWebService visiteWebService = Constantes.VISITE_WEB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// utilisation du service
		List<VisiteWeb> visites = visiteWebService.listerVisites();
		
		Map<String, IntSummaryStatistics> result = visites.stream().collect(
				 groupingBy(
						 VisiteWeb::getChemin,
						 summarizingInt(VisiteWeb::getTempsExecution)));
		
		req.setAttribute("listeVisites", visites);
		req.setAttribute("stats", result);
		
		req.getRequestDispatcher("/WEB-INF/views/visite/listerVisites.jsp").forward(req, resp);

	}
}
