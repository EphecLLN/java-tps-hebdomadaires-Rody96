/**
 * 
 */
package tp2;


/**
 * @author Rody
 *
 */
public class Fractions {

	private	int numerateur;
	private	int denominateur;
		
		public Fractions(int numerateur, int denominateur){
			int pgcd = pgcd(numerateur,denominateur);
			this.numerateur = numerateur/pgcd;
			setDenominateur(denominateur/pgcd);
		}
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Fractions frac = new Fractions(2,4);
			
			System.out.println(frac);
		}
		
		public double getValeurReelle(){
			
			return (double)numerateur / denominateur;
		}

		public int getNumerateur() {
			return numerateur;
		}

		public void setNumerateur(int numerateur) {
			this.numerateur = numerateur;
		}

		public int getDenominateur() {
			return denominateur;
		}
		
		/**
		 * 
		 * Calcule le plus grand commun diviseur entre 2 nombres
		 * 
		 * @param a  premier terme du modulo
		 * @param b  deuxième terme du modulo
		 *
		 * @return   le résultat du l'opération modulo étant ici le PGCD
		 */
		private int pgcd (int a , int b ) {
			while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
			}
			return a;
			
	        }

		public void setDenominateur(int denominateur) {
			if(denominateur == 0) {
				System.out.println("nombre ");
				this.denominateur = 1;
			}
			else {
			this.denominateur = denominateur;
			}
		}
		
		public String toString(){
			String s = "";
			s += numerateur + "/" + denominateur; 
			return s;
		}

	}
