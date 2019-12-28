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
public class Professeur extends Personne {
	
	public Professeur(String nom, String prenom, LocalDate dateNaiss, LocalDate dateArrive) {
		super(nom, prenom, dateNaiss, dateArrive);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1999,Month.JULY,27);
		LocalDate doa = LocalDate.of(2014,Month.SEPTEMBER,15);
		Professeur p = new Professeur("Dupont","Jean", dob, doa);
		
		System.out.println(p);

	}
	
	public int getAnciennete() {

		LocalDate now = LocalDate.now();
		int diff = 0;
		int ageRecrut = 0;
		
		Period period = Period.between(getDateNaiss(),getDateArrive());
		ageRecrut = period.getYears();
		
		for(int i = ageRecrut;i <= 23;i++) {
			if(i >= 23) {
			Period period1 = Period.between(getDateArrive(),now);
			diff = period1.getYears();
			}
		}
		return diff;
	}

	public String toString() {
		return getNom() + " " + getPrenom() + " " + getAge() + " " + getAnciennete();  
	}

}
