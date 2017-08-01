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
	<form class="form-horizontal" method="POST">
		<fieldset>

			<!-- Form Name -->
			<legend>Nouveau collaborateur</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Nom</label>
				<div class="col-md-4">
					<input id="input-nom" name="nom" type="text"
						placeholder="Nom" class="form-control input-md">
				</div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Prénom</label>
				<div class="col-md-4">
					<input id="input-prenom" name="prenom" type="text"
						placeholder="Prénom" class="form-control input-md">
				</div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Date de naissance</label>
				<div class="col-md-4">
					<input id="input-date-de-naissance" name="date-de-naissance" type="date"
						class="form-control input-md">
				</div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">Adresse</label>
				<div class="col-md-4">
					<input id="input-adresse" name="adresse" type="text"
						placeholder="Adresse" class="form-control input-md">
				</div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="textinput">N° de sécurité sociale</label>
				<div class="col-md-4">
					<input id="input-num-secu" name="num-secu" type="text"
						placeholder="N° de sécurité sociale" class="form-control input-md">
				</div>
			</div>
			
			<!-- Button -->
			<div class="form-group">
				<div class="col-md-4">
					<button id="btn-creer" name="creer"
						class="btn btn-primary">Créer</button>
				</div>
			</div>

		</fieldset>
	</form>
</body>
</html>
