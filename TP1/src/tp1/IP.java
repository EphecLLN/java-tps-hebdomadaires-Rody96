/**
 * 
 */
package tp1;

import java.util.Scanner;

/**
 * 
 * Gestion d'adressage IP
 * 
 * @author Rody
 *
 */
public class IP {

private	int octet1;
private	int octet2;
private	int octet3;
private	int octet4;
	
	
	public IP(int octet1, int octet2, int octet3, int octet4){
		this.octet1 = octet1;
		this.octet2 = octet2;
		this.octet3 = octet3;
		this.octet4 = octet4;
	}
	
	 /**
	   * 
	   * Exécution du programme
	   * 
	   * @param args Les arguments de la ligne de commande.
	   * 			   Le premier argument est le premier octet,
	   * 			   Le second argument est le deuxième octet,
	   * 			   Le troisième argument est le troisième octet,
	   * 			   Le quatrième argument est le quatrième octet.
	   */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le premier octet: ");
		int octet1 = sc.nextInt();
		System.out.println("Veuillez entrer le deuxième octet: ");
		int octet2 = sc.nextInt();
		System.out.println("Veuillez entrer le troisième octet: ");
		int octet3 = sc.nextInt();
		System.out.println("Veuillez entrer le dernier octet: ");
		int octet4 = sc.nextInt();
		
		IP newIp = new IP(octet1,octet2,octet3,octet4);
		
		System.out.println(newIp);
	}
	
	/**
	 * Répresente l'objet IP sous forme de chaine de caractères
	 * 
	 * @return une chaine de caractère  
	 */
	public String toString(){
		String s = "";
		s += "Nouvelle adresse ip: " + octet1 + "." + octet2 + "." + octet3 + "." + octet4 ;
		return s;
	}

	public int getOctet1() {
		return octet1;
	}

	public void setOctet1(int octet1) {
		this.octet1 = octet1;
	}

	public int getOctet2() {
		return octet2;
	}

	public void setOctet2(int octet2) {
		this.octet2 = octet2;
	}

	public int getOctet3() {
		return octet3;
	}

	public void setOctet3(int octet3) {
		this.octet3 = octet3;
	}

	public int getOctet4() {
		return octet4;
	}

	public void setOctet4(int octet4) {
		this.octet4 = octet4;
	}
	
	

}
