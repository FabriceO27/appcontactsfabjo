<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style/newContactStyle.css">
<link href="https://fonts.googleapis.com/css?family=Anton&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat&display=swap"
	rel="stylesheet">
<title>${personne.prenom}${personne.nom}</title>
</head>
<body>
	<br>
	<div class="entete">FICHE CONTACT</div>
	<br>
	<br>
	<div class="form">

		<form action="LancerAccueil" method="post">
			<input type="submit" class="ajouter" value="Retour">
			<p></p>
		</form>


			Civilité : ${personne.civilite}<br>
			Prenom : ${personne.prenom}<br>
			Nom : ${personne.nom}
			<p></p>
			Adresse :<br>
			Voie : ${personne.adresse.voie}<br>
			Code postal: ${personne.adresse.codePostal}<br>
			Ville : ${personne.adresse.ville}<br> Pays : ${personne.adresse.pays}<br>


	</div>
</body>
</html>
