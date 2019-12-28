/**
 * 
 */
package tp8;

/**
 * @author Rody
 *
 */
public abstract class Shape implements Transformable, Affichable {
	
	private int id;
	private int x;
	private int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public abstract double surface();
	
	public abstract double perimetre();
	
	public String getNom() {
		String sname = getClass().getSimpleName()+ "-" + this.id;
		return sname;	
	} 
	
	public String affiche() {
		return  getNom() + "\n" + x + ", " + y + "\n" + perimetre() + "\n" + surface();
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
}
