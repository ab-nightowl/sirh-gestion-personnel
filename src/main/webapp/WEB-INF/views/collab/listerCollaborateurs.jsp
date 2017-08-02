<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<c:url value='/bootstrap-3.3.7-dist/css/bootstrap.css'/>">
</head>
<body>
	<div class="container">
		<h1>Les collaborateurs</h1>

		<div class="row">
			<div class="col-md-12 col-lg-12">

				<c:forEach var="collab" items="${listeCollaborateurs}">

					<div class="col-md-4 col-lg-4 ">

						<h3>${collab.nom} ${collab.prenom}</h3>

						<div class="row">
							<div class="col-md-4 col-lg-4">
								<img class="img-responsive" alt="avatar" src="${collab.photo}">
							</div>

							<div class="col-md-3 col-lg-3">
								<p>Fonction</p>
								<p>Département</p>
								<p>Email</p>
								<p>Téléphone</p>
							</div>
							
							<div class="col-md-5 col-lg-5">
								<p>...</p>
								<p>...</p>
								<p>${collab.emailPro}</p>
								<p>...</p>
							</div>
						</div>
						
						<a class="btn btn-primary pull-right" href="#" role="button">Editer</a>

					</div>


				</c:forEach>

			</div>
		</div>
	</div>

</body>
</html>
