<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="dev.sgp.entite.VisiteWeb"%>
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
		<h1>Statistiques</h1>
		
		<div class="row">
			<div class="col-md-12 col-lg-12">
			
				<div class="col-md-4 col-lg-4">
					<h3>Chemin</h3>
					<c:forEach var="stat" items="${stats}">
						<p>${stat.key}</p>
					</c:forEach>
				</div>
				<div class="col-md-2 col-lg-2">
					<h3>Nombre de visites</h3>
					<c:forEach var="stat" items="${stats}">
						<p>${stat.value.count}</p>
					</c:forEach>
				</div>
				<div class="col-md-2 col-lg-2">
					<h3>Min (ms)</h3>
					<c:forEach var="stat" items="${stats}">
						<p>${stat.value.min}</p>
					</c:forEach>
				</div>
				<div class="col-md-2 col-lg-2">
					<h3>Max (ms)</h3>
					<c:forEach var="stat" items="${stats}">
						<p>${stat.value.max}</p>
					</c:forEach>
				</div>
				<div class="col-md-2 col-lg-2">
					<h3>Moyenne (ms)</h3>
					<c:forEach var="stat" items="${stats}">
						<p>${stat.value.average}</p>
					</c:forEach>
				</div>
				
			</div>
		</div>
	</div>
	
</body>
</html>
