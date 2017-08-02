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
	<h1>Statistiques</h1>

	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<div> <h3>Chemin</h3> </div>
				<c:forEach var="stat" items="${stats}">
					<div>${stat.key}</div>
				</c:forEach>
			</div>
			<div class="col-md-2">
				<div> <h3>Nombre de visites</h3> </div>
				<c:forEach var="stat" items="${stats}">
					<div>${stat.value.getCount()}</div>
				</c:forEach>
			</div>
			<div class="col-md-2">
				<div> <h3>Min (ms)</h3> </div>
				<c:forEach var="stat" items="${stats}">
					<div>${stat.value.getMin()}</div>
				</c:forEach>
			</div>
			<div class="col-md-2">
				<div> <h3>Max (ms)</h3> </div>
				<c:forEach var="stat" items="${stats}">
					<div>${stat.value.getMax()}</div>
				</c:forEach>
			</div>
			<div class="col-md-2">
				<div> <h3>Moyenne (ms)</h3> </div>
				<c:forEach var="stat" items="${stats}">
					<div>${stat.value.getAverage()}</div>
				</c:forEach>
			</div>
		</div>
	</div>
	
</body>
</html>
