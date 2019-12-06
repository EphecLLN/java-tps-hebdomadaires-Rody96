/**
 * 
 */
package tp5;

/**
 * @author HE201493
 *
 */
public class Employe extends Personne{

	private int salaire;
	private String employeur;
	
	public Employe(String nom, String prenom, int regNat, String employeur, int salaire) {
		super(nom, prenom, regNat);
		this.salaire = salaire;
		this.employeur = employeur;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String toString() {
    	return super.toString() + " salaire: " + salaire + ", employeur: "+ employeur;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((employeur == null) ? 0 : employeur.hashCode());
		result = prime * result + salaire;
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
		Employe other = (Employe) obj;
		if (employeur == null) {
			if (other.employeur != null)
				return false;
		} else if (!employeur.equals(other.employeur))
			return false;
		if (salaire != other.salaire)
			return false;
		return true;
	}
	
	
    
}
