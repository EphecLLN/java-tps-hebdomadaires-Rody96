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
public class Etudiant extends Personne{
	
	public Etudiant(String nom, String prenom, LocalDate dateNaiss, LocalDate dateArrive) throws DateArriveeInvalideException {
		super(nom, prenom, dateNaiss, dateArrive);
		
		if(getDateArrive().getYear() < 2000 || getDateArrive().getYear() > LocalDate.now().getYear()) {
			throw new DateArriveeInvalideException("Erreur, date invalide");
		}		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1996,Month.JULY,27);
		LocalDate doa = LocalDate.of(2014,Month.SEPTEMBER,15);
		Etudiant etu;
		
		try {
			etu = new Etudiant("Dupont","Jean", dob, doa);
			System.out.println(etu);
		} catch (DateArriveeInvalideException e) {
			e.printStackTrace();
		}
		

	}

	public String getMatricule() {
		String s = getDateArrive().getYear() + "" + getNom().charAt(0) + getPrenom().charAt(0);
		return s;
	}
	
	public int getAnciennete() {
		LocalDate now = LocalDate.now();
		
		Period period = Period.between(getDateArrive(), now);
		int diff = period.getYears();
		
		return diff;
	}
	
	
	public String toString() {
		return getNom() + " " + getPrenom() + " " + getAge() + " " + getAnciennete() + " " + getMatricule();  
	}
	
}
