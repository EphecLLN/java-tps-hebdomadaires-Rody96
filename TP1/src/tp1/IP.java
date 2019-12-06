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
	   * Ex�cution du programme
	   * 
	   * @param args Les arguments de la ligne de commande.
	   * 			   Le premier argument est le premier octet,
	   * 			   Le second argument est le deuxi�me octet,
	   * 			   Le troisi�me argument est le troisi�me octet,
	   * 			   Le quatri�me argument est le quatri�me octet.
	   */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le premier octet: ");
		int octet1 = sc.nextInt();
		System.out.println("Veuillez entrer le deuxi�me octet: ");
		int octet2 = sc.nextInt();
		System.out.println("Veuillez entrer le troisi�me octet: ");
		int octet3 = sc.nextInt();
		System.out.println("Veuillez entrer le dernier octet: ");
		int octet4 = sc.nextInt();
		
		IP newIp = new IP(octet1,octet2,octet3,octet4);
		
		System.out.println(newIp);
	}
	
	/**
	 * R�presente l'objet IP sous forme de chaine de caract�res
	 * 
	 * @return une chaine de caract�re  
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
