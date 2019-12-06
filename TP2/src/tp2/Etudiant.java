/**
 * 
 */
package tp2;
import java.io.*;
/**
 * @author Rody
 *
 */
public class Etudiant {


	private String nom;
	private String prenom;
	private String matricule;
	private static int nbEtudiants = 0;
	
	public Etudiant(String nom, String prenom, String matricule){
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		Etudiant.nbEtudiants++;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Etudiant etu = new Etudiant("Dupont", "Jean", "HE"+ nbEtudiants);
		
		//System.out.println(etu);
		
		try {
			InputStream ips = new FileInputStream("C:\\Users\\Rody\\OneDrive - EPHEC asbl\\Java - Copie\\TP2\\tp4_3.4.2.txt");
			BufferedReader reader =
			new BufferedReader( new InputStreamReader(ips) );
			String line;
			while( (line = reader.readLine()) != null ) {
			System.out.println(line);
			}
			reader.close();
			} catch (IOException e) {
			System.err.println("Erreur lors de la lecture du fichier");
			}
			
		

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
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}


	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public int getNbEtudiants() {
		return nbEtudiants;
	}


	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", matricule=" + matricule + "]";
	}
	
	

}
