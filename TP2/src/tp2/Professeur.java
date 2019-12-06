/**
 * 
 */
package tp2;

/**
 * @author Rody
 *
 */
public class Professeur {

	private String nom;
	private String prenom;
	private String profession;
	
	public Professeur(String nom, String prenom, String profession){
		this.nom = nom;
		this.prenom = prenom;
		this.profession = profession;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Professeur prof = new Professeur("Dupont", "Jean", "Mathématiques");
		
		System.out.println(prof);

	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Professeur: "+ nom + " " + prenom + ", " + profession;
	}

	
}
