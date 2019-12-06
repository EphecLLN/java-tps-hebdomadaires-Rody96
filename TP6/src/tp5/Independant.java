/**
 * 
 */
package tp5;

/**
 * @author HE201493
 *
 */
public class Independant extends Personne{
	
	private String numTva;
	
	public Independant(String nom, String prenom, int regNat, String numTva) {
		super(nom, prenom, regNat);
		this.numTva = numTva;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public String toString() {
    	return super.toString() + " numéro TVA: " + numTva;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((numTva == null) ? 0 : numTva.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		super.equals(obj);
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Independant other = (Independant) obj;
		if (numTva == null) {
			if (other.numTva != null)
				return false;
		} else if (!numTva.equals(other.numTva))
			return false;
		return true;
	}
	
	

}
