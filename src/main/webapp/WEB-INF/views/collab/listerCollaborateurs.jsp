<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
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
	<h1>Les collaborateurs</h1>

	<ul>
		<c:forEach var="collab" items="${listeCollaborateurs}">
			<li> ${collab.nom} </li>
		</c:forEach>
	</ul>
</body>
</html>
