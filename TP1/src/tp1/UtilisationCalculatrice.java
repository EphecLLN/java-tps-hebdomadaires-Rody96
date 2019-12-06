/**
 * 
 */
package tp1;

/**
 * @author Rody
 *
 */
public class UtilisationCalculatrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculatrice cal = new Calculatrice(2.0);
		cal.setValeurCourante(4.0);
		System.out.println(cal.getValeurCourante());

	}

}
