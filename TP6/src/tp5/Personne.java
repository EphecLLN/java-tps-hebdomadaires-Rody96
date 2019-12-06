/**
 * 
 */
package tp5;

/**
 * @author HE201493
 *
 */
public class Personne {
	
	protected String nom;
	protected String prenom;
	protected int regNat;
	
	public Personne(String nom, String prenom, int regNat) {
		this.nom = nom;
		this.prenom = prenom;
		this.regNat = regNat;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + regNat;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (regNat != other.regNat)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personne: nom: " + nom + ", prenom: " + prenom + ", regNat: " + regNat;
	}
	
	

}
