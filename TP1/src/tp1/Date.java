/**
 * 
 */
package tp1;

import java.util.Scanner;

/**
 * Cr�e une date au format jj-mm-aa
 * 
 * 
 * @author Rody
 *
 */
public class Date {
	
private	int jour;
private	int mois;
private	int annee;
	

	public Date(int jour, int mois, int annee){
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	public Date(String date){
	
	}
	
	/**
	 * 
	 * Ex�cution du programme
	 * 
	 * @param args Les arguments de la ligne de commande.
	 * 			   Le premier argument est le jour,
	 * 			   Le second argument est le mois,
	 * 			   Le troisi�me argument est l'ann�e.
	 */
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez entrer le jour: ");
			int jour = sc.nextInt();
			System.out.println("Veuillez entrer le mois: ");
			int mois = sc.nextInt();
			System.out.println("Veuillez entrer l'ann�e: ");
			int annee = sc.nextInt();
			
		Date d = new Date(jour, mois, annee);
		
		System.out.println(d);
		
	}
	
	/**
	 * R�presente l'objet Date sous forme de chaine de caract�res
	 * 
	 * @return une chaine de caract�re  
	 */
	public String toString(){
		String s = "";
		s += jour + "/" + mois + "/" + annee ;
		return s;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	
	

}
