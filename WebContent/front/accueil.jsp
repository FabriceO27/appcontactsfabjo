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
                  ${personne.adresse.voie}
                  ${personne.adresse.codePostal} ${personne.adresse.ville}
                  ${personne.adresse.pays}
              </div>
              <div>
                 <form action="index.html" method="post">
                   <span class="hide" id="pk">${personne.pk}</span><input class="afficher" type="submit" value="Afficher"/>
                 </form>

                 <form action="../ModifierContact" method="get">
                   <span class="hide" id="pk">${personne.pk}</span><input class="modifier" type="submit" value="Modifier"/>
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
