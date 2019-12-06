/**
 * 
 */
package tp4;

import java.util.Arrays;

/**
 * @author Rody
 *
 */
public class Etudiant {
	
	private String nom;
	private String prenom;
	private int [] resultats;
	private Date date;
	
	public Etudiant(String nom, String prenom, int [] resultats, Date date) {
		this.nom = nom;
		this.prenom = prenom;
		this.resultats = resultats;
		this.date = date;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date d = new Date(01,01,2001);
		int [] results = {15,13,9,11};
		Etudiant etu = new Etudiant("Dubois", "Jean", results, d);
		
		
		System.out.println(etu);
		System.out.println(etu.moyenne(results));

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
	 * @return the resultats
	 */
	public int[] getResultats() {
		return resultats;
	}

	/**
	 * @param resultats the resultats to set
	 */
	public void setResultats(int[] resultats) {
		this.resultats = resultats;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	public double moyenne(int [] tab) {
		double moyenne = 0.0;
		if(tab.length == 0) {
			System.out.println("tableau de résultats vide !");
		}
		else {
		for(int i=0;i < tab.length;i++){
			moyenne += tab[i];
		}
		moyenne = moyenne / tab.length;
		}
		return moyenne;
	}

	@Override
	public String toString() {
		return "Etudiant : "+ nom +", "+ prenom +", resultats: "+ Arrays.toString(resultats) + " date de naissance: "+ date;			
	}
	

}
