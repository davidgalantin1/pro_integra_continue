package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import forms.ConnectionForm;

/**
 * Servlet implementation class Controleur
 */
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controleur() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		this.doPost(request, response);
		request.getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Auteur auteur = new Auteur();
//		auteur.setPrenom("toto");
//		auteur.setNom("bouget");
//		auteur.setAge(51);
//
//		String[] titres = {"Le Java pour les Forts", "Le Php pour les Nuls", "les Sports pour les fain�ants"};
//		request.setAttribute("titres", titres);
//		request.setAttribute("auteur",auteur);

//		String nom = request.getParameter("login");
//		String prenom = request.getParameter("password");


//		request.setAttribute("nom", nom);
//		request.setAttribute("prenom", prenom);

		ConnectionForm form = new ConnectionForm();
		form.verifier(request);
		request.setAttribute("form", form);
		request.getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request,response);
	}

}
