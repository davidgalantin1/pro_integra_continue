package bean;
import java.util.Date;

	public class Abonne {

		private String email;
		private String prenom;
		private String nom;
		private Integer journaissance;
		private Integer moisnaissance;
		private Integer anneenaissance;
		private Date dateinscription;
		private Integer inscription;


		public String getEmail() {
			return email;
		}
		@Override
		public String toString() {
			return "Abonne :email=" + email + ", prenom=" + prenom + ", nom=" + nom + ", journaissance=" + journaissance
					+ ", moisnaissance=" + moisnaissance + ", anneenaissance=" + anneenaissance + ", dateinscription="
					+ dateinscription + ", inscription=" + inscription;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public Integer getJournaissance() {
			return journaissance;
		}
		public void setJournaissance(Integer journaissance) {
			this.journaissance = journaissance;
		}
		public Integer getMoisnaissance() {
			return moisnaissance;
		}
		public void setMoisnaissance(Integer moisnaissance) {
			this.moisnaissance = moisnaissance;
		}
		public Integer getAnneenaissance() {
			return anneenaissance;
		}
		public void setAnneenaissance(Integer anneenaissance) {
			this.anneenaissance = anneenaissance;
		}
		public Date getDateinscription() {
			return dateinscription;
		}
		public void setDateinscription(Date dateinscription) {
			this.dateinscription = dateinscription;
		}
		public Integer getInscription() {
			return inscription;
		}
		public void setInscription(Integer inscription) {
			this.inscription = inscription;
		}






	}

