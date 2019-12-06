/**
 * 
 */
package tp2;

import java.util.Arrays;

/**
 * @author Rody
 *
 */
public class GroupeClasse {

	private Professeur profTitulaire;
	private Etudiant etudiants [];
	
	public GroupeClasse(Professeur profTitulaire, Etudiant [] etudiants) {
		this.profTitulaire = profTitulaire;
		this.etudiants = etudiants;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Professeur titulaire = new Professeur("Dupont", "Jean", "Mathématiques");
		Etudiant etudiants [] = new Etudiant [6];
		
		for(int i=0;i < etudiants.length;i++){
			etudiants[i] = new Etudiant("nometu"+i,"prenometu"+i,"HE0000"+i);
		}
		
		GroupeClasse grp = new GroupeClasse(titulaire,etudiants);
		
		System.out.print(grp);

	}

	/**
	 * @return the profTitulaire
	 */
	public Professeur getProfTitulaire() {
		return profTitulaire;
	}

	/**
	 * @param profTitulaire the profTitulaire to set
	 */
	public void setProfTitulaire(Professeur profTitulaire) {
		this.profTitulaire = profTitulaire;
	}

	/**
	 * @return the etudiants
	 */
	public Etudiant[] getEtudiants() {
		return etudiants;
	}

	/**
	 * @param etudiants the etudiants to set
	 */
	public void setEtudiants(Etudiant[] etudiants) {
		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		return "Groupe: professeur titulaire: " + profTitulaire + ", etudiants:" + Arrays.toString(etudiants);
	}

	
}
