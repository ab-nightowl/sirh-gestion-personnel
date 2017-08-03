<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="dev.sgp.entite.CollabEvt"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="<c:url value='/bootstrap-3.3.7-dist/css/bootstrap.css'/>" >
</head>
<body>
	<div class="container">
		<h1>Activités depuis le démarrage de l'application</h1>
		
		<div class="row">
			<div class="col-md-12 col-lg-12">
			
				<div class="col-md-4 col-lg-4">
					<h3>Date/Heure</h3>
					<c:forEach var="activite" items="${listeActivites}">
						<p>${activite.dateHeure.getDayOfMonth()}/${activite.dateHeure.getMonthValue()}/${activite.dateHeure.getYear()} ${activite.dateHeure.getHour()}:${activite.dateHeure.getMinute()}:${activite.dateHeure.getSecond()}</p>
					</c:forEach>
				</div>
				<div class="col-md-8 col-lg-8">
					<h3>Libellé</h3>
					<c:forEach var="activite" items="${listeActivites}">
						<p>${activite.type.getCollab()} - ${activite.matricule}</p>
					</c:forEach>
				</div>
				
			</div>
		</div>
	</div>
	
</body>
</html>
