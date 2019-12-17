<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../Style/newContactStyle.css">
<link href="https://fonts.googleapis.com/css?family=Anton&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat&display=swap"
	rel="stylesheet">


<meta charset="UTF-8">
<title>Modification de Contact</title>
</head>
<body>
	<br>
	<div class="entete">MODIFIER UN CONTACT</div>
	<br>
	<br>
	<div class="form">

		<br>

		<form method="get" action="../LancerAccueil">
			<button type="button" name="button">
				<img src="../pictures/home-icon-silhouette.png" />
			</button>
		</form>
		<br>
		<p></p>


		<form action="../AjouterContact" method="post">

			<input type="radio" id="madame" name="civilite"> <label
				for="madame">Madame</label> <input type="radio" id="monsieur"
				name="civilite"> <label for="monsieur">Monsieur</label> <input
				type="radio" id="mademoiselle" name="civilite"> <label
				for="mademoiselle">Mademoiselle</label>
			<p></p>
			<div>
			
			<label class="align" for="prenom"> Prénom : </label><input type="text" name="prenom" id="prenom" placeholder="Franck"/><p></p>
    <label class="align" for="nom"> nom :       </label><input type="text" name="nom" id="nom" placeholder="Hautbois"/><p></p>
    Adresse <br><br>
    <label class="align" for="voie"> Voie :     </label><input type="text" name="voie" id="voie" placeholder="5 rue de la République"/><br>
    <label class="align" for="cp"> Code postal :</label><input type="text" name="cp" id="cp" placeholder="91440"/><br>
    <label class="align" for="ville"> Ville :   </label><input type="text" name="ville" id="ville" placeholder="Bures-sur-Yvette"/><br>
    <label class="align" for="pays"> Pays :     </label><input type="text" name="pays" id="pays" placeholder="France"/><p></p>
			
			</div>

			<input type="submit" name="ajouter" value="Modifier"> <br>


		</form>
	</div>




</body>
</html>