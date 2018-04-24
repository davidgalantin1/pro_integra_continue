package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Abonne;
import jdbc.Requete;

/**
 * Servlet implementation class ControleurJdbc
 */
@WebServlet("/ControleurJdbc")
public class ControleurJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;


	    public ControleurJDBC() {
	        super();

	    }


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			List<Abonne> abonnes = Requete.listeDesAbonnes();
			request.setAttribute("abonnes", abonnes);
			request.getRequestDispatcher("WEB-INF/formulaireJDBC.jsp").forward(request, response);

		}


		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			System.out.println("je suis dans le DoPost");
			Abonne abonne = new Abonne();
			abonne.setEmail(request.getParameter("email"));
			abonne.setPrenom(request.getParameter("prenom"));
			abonne.setNom(request.getParameter("nom"));
			abonne.setJournaissance(Integer.parseInt(request.getParameter("journaissance")));
			abonne.setMoisnaissance(Integer.parseInt(request.getParameter("moisnaissance")));
			abonne.setAnneenaissance(Integer.parseInt(request.getParameter("anneenaissance")));
//			abonne.setDateinscription(new Date(request.getParameter("dateinscription")));
			abonne.setInscription(Integer.parseInt(request.getParameter("inscription")));
			System.out.println(abonne);


			Requete.ajouterAbonne(abonne);
			List<Abonne> abonnes = Requete.listeDesAbonnes();
			request.setAttribute("abonnes", abonnes);

			request.getRequestDispatcher("WEB-INF/formulaireJDBC.jsp").forward(request, response);

		}

	}
