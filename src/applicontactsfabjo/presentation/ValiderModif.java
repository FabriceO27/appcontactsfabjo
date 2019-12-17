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

/**
 * Servlet implementation class ValiderModif
 */
@WebServlet("/ValiderModif")
public class ValiderModif extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @EJB
	private PersonneServices service;
    private RequestDispatcher dispatcher;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pk = Integer.parseInt(request.getParameter("pk"));
		String civilite = request.getParameter("civilite");
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		String voie = request.getParameter("voie");
		String codePostal = request.getParameter("cp");
		String ville = request.getParameter("ville");
		String pays = request.getParameter("pays");
		
		Personne personne = new Personne(civilite, nom, prenom, new Adresse(voie, codePostal, ville, pays));
		personne.setPk(pk);
		service.updatePersonne(personne, pk);
		
		request.setAttribute("listepersonnes", service.findPersonnes());
		dispatcher = request.getRequestDispatcher("/front/accueil.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
