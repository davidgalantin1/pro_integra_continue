package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import bean.Abonne;

public class Requetes {

		private static Connection connexion;

		public static Connection getConnection()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}

				try {

					connexion = DriverManager.getConnection("jdbc:mysql://51.15.216.64:3306/numerosoft2015", "numerosoft2015", "4pQ5p8Ty");
				} catch (SQLException e) {

					e.printStackTrace();
				}
				return connexion;

		}


		public static void ajouterAbonne(Abonne abonne)
		{

			/*
			INSERT INTO `abonne` (`email`, `prenom`, `nom`, `journaissance`, `moisnaissance`, `anneenaissance`, `dateinscription`, `inscription`)
			 VALUES ('pilou@plouf.fr', 'pilou', 'pilou', '13', '02', '1985', '2016-10-20', '1');

			*/
			System.out.println("abonné avant ajout = "+abonne);

			PreparedStatement statement = null;
			connexion=Requetes.getConnection();

			try {

			statement =  connexion.prepareStatement("insert into abonne (email,prenom, nom, journaissance, moisnaissance, anneenaissance ,dateinscription,inscription ) values (?,?,?,?,?,?,?,?)");

			statement.setString(1, abonne.getEmail());
			statement.setString(2, abonne.getPrenom());
			statement.setString(3, abonne.getNom());

			statement.setInt(4, abonne.getJournaissance());
			statement.setInt(5, abonne.getMoisnaissance());
			statement.setInt(6, abonne.getAnneenaissance());

//			java.util.Date date = new Date();
//			Timestamp timestamp = new java.sql.Timestamp(date.getTime());
	//
//			statement.setTimestamp(7, timestamp);

	// autre test :
//			 Calendar calendar = Calendar.getInstance();
//			 java.util.Date today = new java.util.Date();
//			 java.sql.Date startDate =   new java.sql.Date(today.getTime());
//		     java.util.Date startDate = new Date();

//			DateFormat formaterDate = new SimpleDateFormat("yyyy-MM-dd");
//			Date dateDuJour = formaterDate.parse(new Date());



			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date dateJour = (Date) sdf.parse("2016-10-21");
				abonne.setDateinscription(dateJour);
				statement.setDate(7, (new java.sql.Date(dateJour.getTime())));

			} catch (ParseException e) {

				e.printStackTrace();
			}


//			java.sql.Date d2 = new java.sql.Date(new java.util.Date().getTime());
			statement.setInt(8, abonne.getInscription());
			statement.executeUpdate();

			System.out.println("abonné après ajout = "+abonne);
			}
			catch(SQLException e)
			{
					e.printStackTrace();
			}
			finally
			{
				try
				{
					if (statement!=null) statement.close();
					if (connexion!=null) connexion.close();
				}
				catch(SQLException sqle)
				{
						sqle.printStackTrace();
				}
			}

		}


		public static List<Abonne> listeDesAbonnes()
		{

			List<Abonne> abonnes = new ArrayList<Abonne>();
			Statement statement = null;
			ResultSet resultat = null;

			connexion=Requetes.getConnection();

			try {
				statement =  connexion.createStatement();
				resultat = statement.executeQuery("select * from Abonne");

			while (resultat.next()) {

				Abonne abonne = new Abonne();
				abonne.setEmail(resultat.getString("email"));
				abonne.setPrenom(resultat.getString("prenom"));
				abonne.setNom(resultat.getString("nom"));
				abonne.setJournaissance(resultat.getInt("journaissance"));
				abonne.setMoisnaissance(resultat.getInt("moisnaissance"));
				abonne.setAnneenaissance(resultat.getInt("anneenaissance"));
				abonne.setDateinscription(resultat.getDate("dateinscription"));
				abonne.setInscription(resultat.getInt("inscription"));

				abonnes.add(abonne);

			}

			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if (resultat!=null) resultat.close();
					if (statement!=null) statement.close();
					if (connexion!=null) connexion.close();
				}
				catch(SQLException sqle)
				{

				}
			}
			return abonnes;

		}

	}

