<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="Style/newContactStyle.css">
    <link href="https://fonts.googleapis.com/css?family=Anton&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" rel="stylesheet">
<title>Accueil</title>
</head>
<body>

  <br>
  <div class="entete">CONTACTS</div>
  <br>
  <br>
  <div class="form">
    <a href="front/newContact.html"><input type="button" class="ajouter" name="newcontact" id="newcontact" value="Nouveau contact"/></a><p></p>

    <c:forEach var="personne" items="${listepersonnes}">


      <ul>
          <li class="dropdown">
            <span class="dropbtn yes">${personne.prenom} ${personne.nom}</span>
            <div class="dropdown-content">
              <div class="adresse yes">
                  ${personne.prenom} ${personne.nom}<br>
                  ${personne.adresse.voie}
                  ${personne.adresse.codePostal} ${personne.adresse.ville}
                  ${personne.adresse.pays}
              </div>
              <div>
                 <form action="AfficherContact" method="post">
                   <input type="text" class="hide" name="pk" value="${personne.pk}"/><input class="afficher" type="submit" value="Afficher"/>
                 </form>

                 <form action="ModifierContact" method="post">
                   <input type="text" class="hide" name="pk" value="${personne.pk}"/><input class="modifier" type="submit" value="Modifier"/>
                 </form>
              </div>
            </div>
          </li>
      </ul>
    <br>
		</c:forEach>



  </div>
</body>
</html>
