/**
 * 
 */
package tp1;

/**
 * @author HE201493
 *
 */
public class Cercle {

	
	private double rayon;
	
	public Cercle(double rayon){
		this.rayon = rayon;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cercle c = new Cercle(2.5);
		
		System.out.println(c.perimetreCercle());
	}

	
	public double aireCercle(){
		return Math.PI * (Math.pow(rayon, 2)); //π × R^2
	}
	
	public double perimetreCercle(){
		return 2 * Math.PI * rayon; //P = 2 × π × r
	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	
	public String toString() {
		String s = "";
		s += "results" + rayon;
		return s;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Cercle other = (Cercle)obj;
		if(this.rayon != other.rayon)
			return false;
		return true;
		}
	
	public int compareTo(Cercle c) {
		if(this.rayon < c.rayon)
			return -1;
		if(this.rayon > c.rayon)
			return 1;
		return 0;
	}
	
	
}
