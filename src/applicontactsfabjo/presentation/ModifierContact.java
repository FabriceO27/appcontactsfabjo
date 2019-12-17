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

/**
 * Servlet implementation class ModifierContact
 */
@WebServlet("/ModifierContact")
public class ModifierContact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private PersonneServices service;
	private RequestDispatcher dispatcher;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int pk = Integer.parseInt(request.getParameter("pk"));
		System.out.println(pk);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
