<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="Style/newContactStyle.css">
<title>Accueil</title>
</head>
<body>
  <form class="form">
    <span>CONTACTS</span>
    <a href="front/newContact.html"><input type="button" name="newcontact" id="newcontact" value="+"/></a><p></p>

    <c:forEach var="personne" items="${listepersonnes}">
      <ul>
          <li class="dropdown">
            <span class="dropbtn">${personne.prenom} ${personne.nom}</span>
            <div class="dropdown-content">
              <span class="adresse">

                  ${personne.adresse.voie}
                  ${personne.adresse.codePostal} ${personne.adresse.ville}
                  ${personne.adresse.pays}

              </span>
            </div>
          </li>
      </ul><br>
		</c:forEach>



  </form>
</body>
</html>
