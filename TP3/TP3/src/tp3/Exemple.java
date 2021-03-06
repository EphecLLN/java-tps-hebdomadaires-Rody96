/**
 * 
 */
package tp3;

/**
 * @author HE201493
 *
 */
public class Exemple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
	}
	
	/**
	 * M�thode v�rifiant si un nombre est pair
	 * 
	 * pre n != 0
	 * 
	 * @param n nombre entier quelconque
	 * @return true si le nombre est pair, false sinon.
	 */
	public boolean isPair(int n) {
		if(n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * M�thode calculant le p�rim�tre d'un carr� sur base de la longueur de son cot� pass� en param�tre.
	 * 
	 * pre n > 0 
	 * 
	 * post
	 * 
	 * @param cote nombre correspondant � un cot� du carr�
	 * @return un nombre > 0, le r�sultat �tant le p�rim�tre du carr�.
	 */
	public int perimetreCarre(int cote) {
		int perim = 0;
		if(cote < 0) {
			System.out.println("nombre inf�rieur ou �gale � 0");
		}
		else {
			perim = 4 * cote;
		}
		return perim;
	}
	
	/**
	 * M�thode v�rifiant si le caract�re pass� en argument se trouve dans la chaine de caract�re �galement pass� en param�tre.
	 * 
	 * pre str ne peut pas �tre vide.
	 *  
	 * post
	 *  
	 * @param c caract�re quelconque
	 * @param str chaine de caract�res
	 * @return
	 */
    public boolean contientCaractere(char c, String str){
    	for(int i=0;i < str.length();i++){
    		if(str.charAt(i) == c) {
    			return true;
    		}
    	}	
    	return false;
    }
 
}
