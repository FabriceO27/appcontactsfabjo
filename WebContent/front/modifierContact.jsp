<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Style/newContactStyle.css">
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


		<p></p>


		<form action="ValiderModif" method="post">

			<label class="align" for="civilite"> Civilité : </label>
	      <select name="civilite" id="civilite" value="${personne.civilite}">
	          <option value="">-- civilite --</option>
	           <option value="Mlle">Mlle</option>
	           <option value="Mme">Mme</option>
	           <option value="M">M</option>
	        </select><p></p>
			<div>

		<input type="text" class="hide" name="pk" value="${personne.pk}"/>
		<label class="align" for="prenom"> Prénom : </label><input type="text" name="prenom" id="prenom" placeholder="Franck" value="${personne.prenom}" required/><p></p>
    <label class="align" for="nom"> nom :       </label><input type="text" name="nom" id="nom" placeholder="Hautbois" value="${personne.nom}" required/><p></p>
    Adresse <br><br>
    <label class="align" for="voie"> Voie :     </label><input type="text" name="voie" id="voie" placeholder="5 rue de la République" value="${personne.adresse.voie}"/><br>
    <label class="align" for="cp"> Code postal :</label><input type="text" name="cp" id="cp" placeholder="91440" value="${personne.adresse.codePostal}"/><br>
    <label class="align" for="ville"> Ville :   </label><input type="text" name="ville" id="ville" placeholder="Bures-sur-Yvette" value="${personne.adresse.ville}"/><br>
    <label class="align" for="pays"> Pays :     </label><input type="text" name="pays" id="pays" placeholder="France" value="${personne.adresse.pays}"/><p></p>

			</div>

			<input type="submit" class="modifier" name="modifier" value="Modifier"> <br>


		</form>
	</div>




</body>
</html>
