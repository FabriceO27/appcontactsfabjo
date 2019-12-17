package applicontactsfabjo.presentation;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import applicontactsfabjo.services.PersonneServices;

/**permet d'afficher tous les contacts
 * Servlet implementation class LancerAccueil
 */
@WebServlet("/LancerAccueil")
public class LancerAccueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private PersonneServices service;
	private RequestDispatcher dispatcher;
	
	/**utilisée comme point d'entrée de l'application pour afficher les résultats
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listepersonnes", service.findPersonnes());
		dispatcher = request.getRequestDispatcher("/front/accueil.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
