/**
 * 
 */
package tp4;


/**
 * @author Rody
 *
 */
public class Date {

	private	int jour;
	private	int mois;
	private	int annee;
		

		public Date(int jour, int mois, int annee){
			this.jour = jour;
			this.mois = mois;
			this.annee = annee;
		}
		
		/**
		 * 
		 * Ex�cution du programme
		 * 
		 * @param args Les arguments de la ligne de commande.
		 * 			   Le premier argument est le jour,
		 * 			   Le second argument est le mois,
		 * 			   Le troisi�me argument est l'ann�e.
		 */
		public static void main(String[] args) {
			
			if(args.length == 0) {
				System.out.println("Param�tres manquants");
			}
			else {		
			Date d = new Date(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
			
			System.out.println(d);
			}
		}
		
		/**
		 * R�presente l'objet Date sous forme de chaine de caract�res
		 * 
		 * @return une chaine de caract�re  
		 */
		public String toString(){
			String s = "";
			s += jour + "/" + mois + "/" + annee ;
			return s;
		}

		public int getJour() {
			return jour;
		}

		public void setJour(int jour) {
			this.jour = jour;
		}

		public int getMois() {
			return mois;
		}

		public void setMois(int mois) {
			this.mois = mois;
		}

		public int getAnnee() {
			return annee;
		}

		public void setAnnee(int annee) {
			this.annee = annee;
		}

}
