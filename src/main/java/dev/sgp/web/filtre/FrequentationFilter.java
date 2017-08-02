package dev.sgp.web.filtre;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.VisiteWebService;
import dev.sgp.util.Constantes;

@WebFilter(urlPatterns = { "/*" },
description = "Frequentation filter")
public class FrequentationFilter implements Filter {

	// récupération du service
	private VisiteWebService visiteWebService = Constantes.VISITE_WEB_SERVICE;
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		long before = System.currentTimeMillis();
		
		String contextPath = ((HttpServletRequest) req).getContextPath();
		String path = ((HttpServletRequest) req).getRequestURI();
		String chemin = path.substring(contextPath.length());
		
		VisiteWeb visite = new VisiteWeb(null, chemin, null);
		
		chain.doFilter(req, resp);
		
		long after = System.currentTimeMillis();
		
		Integer tempsExecution = (int) (after - before);
		visite.setTempsExecution(tempsExecution);
		visiteWebService.sauvegarderVisite(visite);
		
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}

}
