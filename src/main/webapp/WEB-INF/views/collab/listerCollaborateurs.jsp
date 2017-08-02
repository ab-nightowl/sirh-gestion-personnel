<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>

	<ul>
		<%
			List<Collaborateur> listeCollab = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
			for (Collaborateur c : listeCollab) {
		%>
		<li><%= c.getNom()%></li>
		<%
			}
		%>
	</ul>
</body>
</html>
