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
	<div class="container">
		<h1>Les collaborateurs</h1>
		
		<div class="row">
			
			<c:forEach var="collab" items="${listeCollaborateurs}">
				
				<div class="col-md-12 col-lg-12">
				
					<div class="col-md-4 col-lg-4">
						
							<h3> ${collab.nom} ${collab.prenom} </h3>
							
							<div class="row">
								<div class="col-md-4 col-lg-4">
									${collab.photo}
								</div>
								
								<div class="col-md-8 col-lg-8">
									
									
								</div>
							</div>
						
					</div>
					
				</div>
			</c:forEach>
			
				
		</div>
	</div>
	
</body>
</html>
