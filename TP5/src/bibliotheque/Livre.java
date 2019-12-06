/**
 * 
 */
package bibliotheque;

import java.util.Arrays;

/**
 * @author HE201493
 *
 */
public class Livre {
	
	private String auteur;
	private String titre;
	private int anneeEdit;
	private String [] pages;
	
	public Livre(String auteur, String titre, int anneeEdit){
		setAuteur(auteur);
		setTitre(titre);
		setAnneeEdit(anneeEdit);
		pages = new String [100];
		setPages(pages);
	}
	
	public Livre(String auteur, String titre, int anneeEdit, String [] pages) {
		setAuteur(auteur);
		setTitre(titre);
		setAnneeEdit(anneeEdit);
		setPages(pages);
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] pages = new String [] {"Hello", "100", "Hola","Guten","Ohayo"};
		Livre l = new Livre ("Orwell","1984", 2000 ,pages);
		//Livre l = new Livre ("Orwell","1984", 2000);
		//System.out.println(l);
		System.out.println(l.setPage(4,"Yo"));
		//System.out.println(l.getFirstPage());
		System.out.println(l.getPage(4));
		

	}
	
	public String getPage(int i) {
		String page = "";
		
		for( int j=0; j < pages.length;j++){
			if(j == i && pages[j] == null) {
				return null;
			}
			else if(j == i && pages[j] != null) {
				page = pages[j];
			}
		}
		
		return page;
	}
	
	public String setPage(int i, String p) {
		String previousPage = "";
		
		for( int j=0; j < pages.length;j++){
			if(j == i && pages[j] != null) {
				previousPage = pages [j];
				pages[j] = p;
				break;
			}
			else if(j == i && pages[j] == null){
				System.out.println("Indice de page introuvable");
			}
		}
		
		return previousPage;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		if(auteur == null || auteur == "") {
			this.auteur = "Auteur inconnu";
		}
		else {
		this.auteur = auteur;
		}
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		if(titre == null || titre == "") {
			this.titre = "Titre inconnu";
		}
		else {
		this.titre = titre;
		}
	}

	/**
	 * @return the anneeEdit
	 */
	public int getAnneeEdit() {
		return anneeEdit;
	}

	/**
	 * @param anneeEdit the anneeEdit to set
	 */
	public void setAnneeEdit(int anneeEdit) {
		this.anneeEdit = anneeEdit;
	}

	/**
	 * @return the pages
	 */
	public String[] getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(String[] pages) {
		this.pages = pages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anneeEdit;
		result = prime * result + ((auteur == null) ? 0 : auteur.hashCode());
		result = prime * result + Arrays.hashCode(pages);
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		if (anneeEdit != other.anneeEdit)
			return false;
		if (auteur == null) {
			if (other.auteur != null)
				return false;
		} else if (!auteur.equals(other.auteur))
			return false;
		if (!Arrays.equals(pages, other.pages))
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "[Livre] auteur: " + auteur + ", titre: " + titre + ", anneeEdit: " + anneeEdit ;
	}
	
	public String getFirstPage() {
		return getPage(0);
	}

	public String extrait() {
		return getFirstPage();
	}
	
	
	
	
	
	

}
