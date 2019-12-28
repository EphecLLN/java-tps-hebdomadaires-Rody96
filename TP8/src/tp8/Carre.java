/**
 * 
 */
package tp8;

/**
 * @author Rody
 *
 */
public class Carre extends Shape {

	private int cote;
	
	public Carre(int x, int y, int cote) {	
		super(x,y);
		this.cote = cote;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double surface() {
		return Math.pow(cote, 2.0);
	}

	@Override
	public double perimetre() {
		return 4.0 * cote;
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
