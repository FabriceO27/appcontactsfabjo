package applicontactsfabjo.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import applicontactsfabjo.entities.Adresse;
import applicontactsfabjo.entities.Personne;
import applicontactsfabjo.services.PersonneServices;

/**
 * Servlet implementation class AjouterContact
 */
@WebServlet("/AjouterContact")
public class AjouterContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private RequestDispatcher dispatcher;
    @EJB
    private PersonneServices service;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String civilite = request.getParameter("civilite");
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		String voie = request.getParameter("voie");
		String codePostal = request.getParameter("cp");
		String ville = request.getParameter("ville");
		String pays = request.getParameter("pays");
		
		Adresse adresse = new Adresse(voie, codePostal, ville, pays);
		List<Adresse> adresses = new ArrayList<Adresse>();
		adresses.add(adresse);
		Personne personne = new Personne(civilite, nom, prenom, adresses);
		
		service.addPersonne(personne);
		request.setAttribute("listepersonnes", service.findPersonnes());
		dispatcher = request.getRequestDispatcher("/front/accueil.jsp");
		dispatcher.forward(request, response);
		
	}

}
