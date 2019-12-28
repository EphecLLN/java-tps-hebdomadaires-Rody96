/**
 * 
 */
package tp8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * @author Rody
 *
 */
public class Personne implements Affichable {
	
	private String nom;
	private String prenom;
	private LocalDate dateNaiss;
	private LocalDate dateArrive;
	
	public Personne(String nom, String prenom, LocalDate dateNaiss, LocalDate dateArrive) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.dateArrive = dateArrive;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1996,Month.JULY,27);
		LocalDate doa = LocalDate.of(2014,Month.SEPTEMBER,15);
		Personne p = new Personne("Dupont","Jean", dob, doa);
		
		//System.out.println(p.getAge());
		System.out.println(p.affiche());

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
	 * @return the dateNaiss
	 */
	public LocalDate getDateNaiss() {
		return dateNaiss;
	}

	/**
	 * @param dateNaiss the dateNaiss to set
	 */
	public void setDateNaiss(LocalDate dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/**
	 * @return the dateArrive
	 */
	public LocalDate getDateArrive() {
		return dateArrive;
	}

	/**
	 * @param dateArrive the dateArrive to set
	 */
	public void setDateArrive(LocalDate dateArrive) {
		this.dateArrive = dateArrive;
	}
	
	public int getAge() {
		LocalDate now = LocalDate.now();
		
		Period period = Period.between(getDateNaiss(), now);
		int diff = period.getYears();
		
		return diff;
	}

	@Override
	public String affiche() {
		return getNom() + " " + getPrenom() + " " + getAge() + " " + getDateNaiss() + " " + getDateArrive();  
	}

}
