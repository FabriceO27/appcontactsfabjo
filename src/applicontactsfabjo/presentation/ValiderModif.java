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
import applicontactsfabjo.services.AdresseServices;
import applicontactsfabjo.services.PersonneServices;

/**methode no implémentée, permettra de valider les modifications d'un contacts
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
		String civilite = request.getParameter("civilite"); System.out.println(civilite);
		String prenom = request.getParameter("prenom"); System.out.println(prenom);
		String nom = request.getParameter("nom"); System.out.println(nom);
		String voie = request.getParameter("voie"); System.out.println(voie);
		String codePostal = request.getParameter("cp"); System.out.println(codePostal);
		String ville = request.getParameter("ville"); System.out.println(ville);
		String pays = request.getParameter("pays"); System.out.println(pays);
		Adresse adresse = new Adresse(voie, codePostal, ville, pays);
		Personne personne = new Personne(civilite, nom, prenom, adresse);
		personne.setPk(pk);
		service.updatePersonne(personne, adresse);

		
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
