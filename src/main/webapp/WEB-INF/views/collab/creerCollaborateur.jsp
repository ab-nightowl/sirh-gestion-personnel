<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SGP - App</title>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
	<div class="container">
	
		<form class="form-horizontal" method="POST">
			<fieldset>
	
				<!-- Form Name -->
				<legend>Nouveau collaborateur</legend>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="input-nom">Nom</label>
					<div class="col-md-4">
						<input id="input-nom" name="nom" type="text"
							placeholder="Nom" class="form-control input-md">
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="input-prenom">Prénom</label>
					<div class="col-md-4">
						<input id="input-prenom" name="prenom" type="text"
							placeholder="Prénom" class="form-control input-md">
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="input-date-de-naissance">Date de naissance</label>
					<div class="col-md-4">
						<input id="input-date-de-naissance" name="date-de-naissance" type="date"
							class="form-control input-md">
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="input-adresse">Adresse</label>
					<div class="col-md-4">
						<input id="input-adresse" name="adresse" type="text"
							placeholder="Adresse" class="form-control input-md">
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="input-num-secu">N° de sécurité sociale</label>
					<div class="col-md-4">
						<input id="input-num-secu" name="num-secu" type="text"
							placeholder="N° de sécurité sociale" class="form-control input-md">
					</div>
				</div>
				
				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="btn-creer"></label>
					<div class="col-md-4">
						<button type="submit" id="btn-creer" name="creer"
							class="btn btn-primary">Créer</button>
					</div>
				</div>
	
			</fieldset>
		</form>
	
	</div>
</body>
</html>
