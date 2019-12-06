/**
 * 
 */
package tp1;

/**
 * Inscription d'un(e) étudiant(e)
 * 
 * @author Rody
 *
 */
public class Etudiant {

private String nom;
private String prenom;
private int matricule;
private Date d;

	public Etudiant(String n, String p, int m,Date d) {
		this.nom = n;
		this.prenom = p;
		this.matricule = m;
	    this.d = d;
	}
   /**
    * 
    * Exécution du programme
    * 
    * @param args Les arguments de la ligne de commande.
    * 			   Le premier argument est le nom,
    * 			   Le second argument est le prénom,
    * 			   Le troisième argument est le matricule.
    */
	public static void main(String[] args) {
		
		 if(args.length == 0){
	            System.out.println("Paramètres manquants ou entrée(s) incorrecte(s)");
	        }
	        else{
	        	Date d = new Date(1,1,2001);
	            Etudiant etu = new Etudiant(args[0],args[1],Integer.parseInt(args[2]),d);
	        System.out.println(etu);
	       }
	}
	
	/**
	 * Répresente l'objet Etudiant sous forme de chaine de caractères
	 * 
	 * @return une chaine de caractère  
	 */
	public String toString() {
		String s = "";
		s += nom + " " + prenom + " né(e) le "+ d + " ,vient de s'inscrire comme étudiant avec pour matricule HE"+ matricule;
		return s;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	public Date getDate() {
		return d;
	}
	
	public void setMatricule(Date date) {
		this.d = date;
	}

}
