<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
  <form class="form">
    <span>CONTACTS</span>
    <a href="front/newContact.html"><input type="button" name="newcontact" id="newcontact" value="+"/></a><p></p>

    <c:forEach var="personne" items="${listepersonnes}">
			<tr>
				<td id="${personne.pk}">
          <div class="contact">
            ${personne.prenom} ${personne.nom}
          </div>
          <div class="adresse">
            ${personne.adresse.voie} <br>
            ${personne.adresse.codePostal} ${personne.adresse.ville}<br>
            ${personne.adresse.pays}
          </div>
        </td>

			</tr><br>
		</c:forEach>



  </form>
</body>
</html>
