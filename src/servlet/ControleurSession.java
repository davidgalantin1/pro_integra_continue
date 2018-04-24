package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ControleurSession extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ControleurSession() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(); // on initie le moteur de session

		// exemple de récupération de variable session : String prenom = (String) session.getAttribute("prenom");

		// exemple pour supprimer les informations de la session : session.invalidate();

		request.getRequestDispatcher("WEB-INF/formulaireSession.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		HttpSession session = request.getSession(); // on initie le moteur de session

		session.setAttribute("nom",nom);
		session.setAttribute("prenom",prenom);

		request.getRequestDispatcher("WEB-INF/formulaireSession.jsp").forward(request, response);

	}

}
