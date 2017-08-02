package dev.sgp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import dev.sgp.entite.VisiteWeb;

public class VisiteWebService {
	
	public VisiteWebService() {
		
	}

	List<VisiteWeb> visites = new ArrayList<>();
	
	public List<VisiteWeb> listerVisites() {
		return visites;
	}
	
	public void sauvegarderVisite(VisiteWeb visite) {
		visites.add(visite);
	}
	
	public Map<String, List<VisiteWeb>> filtrerVisites() {
		Map<String, List<VisiteWeb>> visitesFiltrees = visites.stream().collect(Collectors.groupingBy(VisiteWeb::getChemin));
		
		return visitesFiltrees;
	}
	
}
