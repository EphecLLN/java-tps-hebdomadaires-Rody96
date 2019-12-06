/**
 * 
 */
package tp1;

/**
 * 
 * Bibliothèque de livres
 * 
 * @author Rody
 *
 */
public class Livre {
	
private String titre;
private String auteur;
private String isbn;

	public Livre(String titre, String auteur, String isbn) {
		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
	}
	
	
	 /** 
	   * 
	   * Exécution du programme
	   * 
	   * @param args Les arguments de la ligne de commande.
	   * 			   Le premier argument est le titre du livre,
	   * 			   Le second argument est l'auteur du livre,
	   * 			   Le troisième argument est son numéro ISBN.
	   */
	public static void main(String[] args) {
		Livre l = new Livre(args[0], args[1] , args[2]);
		
		System.out.println(l);
	}
	
	/**
	 * Répresente l'objet Livre sous forme de chaine de caractères
	 * 
	 * @return une chaine de caractère  
	 */
	public String toString(){
		String s = "";
		s += "Titre : " + titre + ", écrit par: " + auteur + ", numéro ISBN: " + isbn ;
		return s;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	

}
