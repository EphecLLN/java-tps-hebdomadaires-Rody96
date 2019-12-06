/**
 * 
 */
package tp1;

/**
 * @author Rody
 * 
 * Classe Calculatrice permettant d'effectuer des op�rations arithm�tiques sur base d'une valeur donn�e (+,-,/,*,n�)
 *
 */
public class Calculatrice {

private double valeurCourante = 0.0;


	public Calculatrice(double valeurCourante) {
	this.valeurCourante = valeurCourante;
	}


	/**
	 * @param args  Les arguments de la ligne de commande.
	 * 				L'argument ici correspond � la valeur courante. 
	 */
	public static void main(String[] args) {
	    Calculatrice myCalc = new Calculatrice(4.0);

	    myCalc.ajoute(10);
    
	    System.out.println(myCalc);
	}

	/**
	 * 
	 * @param n nombre additionn� � la valeur courante.
	 */
	public void ajoute(double n) {
	    valeurCourante = valeurCourante + n;
	}

	/**
	 * 
	 * @param n nombre soustrait � la valeur courante.
	 */
	public void soustrait(double n) {
	    valeurCourante -= n;
	}

	/**
	 * 
	 * @param n nombre multipli� par la valeur courante.
	 */
	public void multiplie(double n) {
	    valeurCourante *= n;
	}

	/**
	 * 
	 * @param n nombre divis� par la valeur courante.
	 */
	public void divise(double n) {
	    valeurCourante = valeurCourante / n; 
	}

	/**
	 * 
	 * M�thode �l�vant au carr� la valeur courante.
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
	 * @param n nouvelle valeur attribu� � la valeur courante
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
