/**
 * 
 */
package tp8;

/**
 * @author Rody
 *
 */
public class Point extends Shape {
	
	int x,y;
	
	public Point(int x, int y) {
		super(x,y);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double surface() {
		return 0;
	}

	@Override
	public double perimetre() {
		return 0;
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
