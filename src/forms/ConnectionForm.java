package forms;


import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {

	private String resultat;

	public void verifier(HttpServletRequest request)
	{
			String login = request.getParameter("login");
			String password = request.getParameter("password");

			if (password.equals(login + "123"))
			{
				this.resultat="Bravo, vous êtes connecté !";
			}
			else
			{
				this.resultat="Votre identifiant est incorrect !";
			}


	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}



}
