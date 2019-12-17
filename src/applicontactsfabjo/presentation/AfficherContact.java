package applicontactsfabjo.presentation;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import applicontactsfabjo.entities.Adresse;
import applicontactsfabjo.entities.Personne;
import applicontactsfabjo.services.PersonneServices;

/**Servlet permettant d'afficher un contact particulier
 * Servlet implementation class AfficherContact
 */
@WebServlet("/AfficherContact")
public class AfficherContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private RequestDispatcher dispatcher;
    @EJB
    private PersonneServices service;

	/**avec les information du contact lançant la méthode, cherche les données dans la bdd et l'affiche sur la page afficher
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pk = Integer.parseInt(request.getParameter("pk"));
		String civilite = service.findPersonneById(pk).get(0).getCivilite();
		String prenom = service.findPersonneById(pk).get(0).getPrenom();
		String nom = service.findPersonneById(pk).get(0).getNom();
		Adresse adresse = service.findPersonneById(pk).get(0).getAdresse();
		
		request.setAttribute("personne", new Personne(civilite, nom, prenom, adresse));
		dispatcher = request.getRequestDispatcher("front/afficher.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
