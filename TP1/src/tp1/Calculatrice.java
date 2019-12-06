/**
 * 
 */
package tp1;

/**
 * @author Rody
 * 
 * Classe Calculatrice permettant d'effectuer des opérations arithmétiques sur base d'une valeur donnée (+,-,/,*,n²)
 *
 */
public class Calculatrice {

private double valeurCourante = 0.0;


	public Calculatrice(double valeurCourante) {
	this.valeurCourante = valeurCourante;
	}


	/**
	 * @param args  Les arguments de la ligne de commande.
	 * 				L'argument ici correspond à la valeur courante. 
	 */
	public static void main(String[] args) {
	    Calculatrice myCalc = new Calculatrice(4.0);

	    myCalc.ajoute(10);
    
	    System.out.println(myCalc);
	}

	/**
	 * 
	 * @param n nombre additionné à la valeur courante.
	 */
	public void ajoute(double n) {
	    valeurCourante = valeurCourante + n;
	}

	/**
	 * 
	 * @param n nombre soustrait à la valeur courante.
	 */
	public void soustrait(double n) {
	    valeurCourante -= n;
	}

	/**
	 * 
	 * @param n nombre multiplié par la valeur courante.
	 */
	public void multiplie(double n) {
	    valeurCourante *= n;
	}

	/**
	 * 
	 * @param n nombre divisé par la valeur courante.
	 */
	public void divise(double n) {
	    valeurCourante = valeurCourante / n; 
	}

	/**
	 * 
	 * Méthode élévant au carré la valeur courante.
	 * 
	 */
	public void carre() {
	    valeurCourante = Math.pow(valeurCourante,2);
	}

	/**
	 * 
	 * @return retourne la valeur courante de l'objet Calculatrice
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}

	/**
	 * 
	 * @param n nouvelle valeur attribué à la valeur courante
	 */
	public void setValeurCourante(double n) {
	this.valeurCourante = n;
	}

	public String toString(){
		String s = "";
		s += valeurCourante;
		return s;
	}

}
