/**
 * 
 */
package tp8;

/**
 * @author Rody
 *
 */
public class Cercle extends Shape {

	private int rayon;
	
	public Cercle(int x, int y, int rayon) {
		super(x,y);
		this.rayon = rayon;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cercle c = new Cercle(5,4,14);
		
		c.agrandit(2);

	}

	@Override
	public double surface() {
		return Math.PI * Math.pow(rayon,2.0);
	}

	@Override
	public double perimetre() {
		return 2.0 * Math.PI * rayon;
	}

	@Override
	public void deplace(int deltaX, int deltaY) {
		setX(deltaX); 
		setY(deltaY);
		
	}

	@Override
	public void agrandit(int facteur) {
		double val = 0.0;
		val = facteur * perimetre();
		System.out.println(val);
		
	}

}
