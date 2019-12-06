package bibliotheque;

import java.util.Arrays;

public class Dictionnaire extends Livre{

	private String [][] dictPages = new String [100][10]; //[100][10]
	String langue;
	
	public Dictionnaire(String auteur, String titre, int anneeEdit,String [][] dictPages, String langue) {
		super(auteur,titre,anneeEdit);
		setDictPages(dictPages);
		setLangue(langue);
	}
	
	public static void main(String[] args) {
		String [][] dictPages = new String [100][10];
		String langue = "français";
		Dictionnaire d = new Dictionnaire("Larousse", "Dictionnaire", 2019, dictPages, langue);
		String [] page1 = {	"vert: Qui est d’une couleur semblable à celle des feuilles, des herbes.",
							"bon: Généreux, qui fait le bien.",
							"drole: Comique, marrant, rigolo.",
							"enclin: Qui est porté de son naturel à quelque chose.",
							"balle: Objet sphérique utilisé pour jouer.",
							"cheuveu:  Filament organique synthétisé par l’épiderme du crâne humain",
							"tasse: Récipient pour boire, muni d’une anse.",
							"feuille: Feuille de papier à impression",
							"mouchoir: Carré de tissu dont on se sert pour se moucher",
							"verre: Matière solide, amorphe, transparente, dure et fragile",
							};
		
		d.setPage(0, page1);
		
		System.out.print(d.getDefinition(0,4));
		System.out.print(d.setDefinition(0,4,"chaussure: Ce que l’on met au pied pour se chausser."));
		System.out.print(d.getPage(0));
	}
	
	public String getPage(int indicePage) {
		String page = "";
		
		if(indicePage < 0 || indicePage > 100) {
			System.out.println("indice de page ne se trouve pas dans l'intervalle");
			return null;
			}
		else {
			if(dictPages[indicePage] == null) {
				System.out.println("Page non trouvé");
			}
			else {
				for(int i=0; i < dictPages[i].length;i++) {
					if(dictPages[i] != null) {
					page += dictPages[indicePage][i] + "\n";
					}
				}
			}
		}
		
		
		 return page;
	}
	
	public String setPage(int indicePage, String [] newPage) {
		String prevPage = "";
		
		if(indicePage < 0 || indicePage > 100) {
			System.out.println("indice de page ne se trouve pas dans l'intervalle");
			return null;
			}
		else {
			if(dictPages[indicePage] == null) {
				System.out.println("Page non trouvé");
			}
			else {
				for(int i=0; i < dictPages[indicePage].length;i++) {
					prevPage += dictPages[indicePage][i] + "\n";
					dictPages[indicePage][i] = newPage[i];
				}
				}
			}
		return prevPage;
	}
	
	public String extrait() {
		return getDefinition(0,0);
	}
	
	public String getFirstPage() {
		return getPage(0);
	}

	/**
	 * @return the dictPages
	 */
	public String[][] getDictPages() {
		return dictPages;
	}

	/**
	 * @param dictPages the dictPages to set
	 */
	public void setDictPages(String[][] dictPages) {
		this.dictPages = dictPages;
	}

	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}
	
	public String getDefinition(int indicePage, int indiceDefinition) {
		if((indicePage < 0 || indicePage > 100) || (indiceDefinition < 0 || indiceDefinition > 10) ||dictPages[indicePage][indiceDefinition] == null){
			System.out.println("definition non trouvé ou indice de page ou/et indice de définition hors l'intervalle");
			return null;
		}
		else {
		return dictPages[indicePage][indiceDefinition];
		}
	}
	
	public String setDefinition(int indicePage, int indiceDefinition, String newDefinition) {
		String prevDefinition = "";
		
		if((indicePage < 0 || indicePage > 100) || (indiceDefinition < 0 || indiceDefinition > 10)) {
			System.out.println("indice de page ou/et indice de définition hors l'intervalle ou page pleine");
			return null;
		}
		else {
			prevDefinition = dictPages[indicePage][indiceDefinition];
			dictPages[indicePage][indiceDefinition] = newDefinition;
			return prevDefinition;
		}
		
	}
	
	public String toString() {
		return "auteur: "+ getAuteur() +", titre: "+ getTitre() + "anneEdit: "+ getAnneeEdit();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.deepHashCode(dictPages);
		result = prime * result + ((langue == null) ? 0 : langue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Dictionnaire))
			return false;
		Dictionnaire other = (Dictionnaire) obj;
		if (!Arrays.deepEquals(dictPages, other.dictPages))
			return false;
		if (langue == null) {
			if (other.langue != null)
				return false;
		} else if (!langue.equals(other.langue))
			return false;
		return true;
	}

	
}
