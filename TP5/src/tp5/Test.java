package tp5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Personne pers = new Personne("Jules", "Dupont", 123234);
		Personne emp = new Employe("Jules", "Dupont", 123234, "EPHEC", 1500);
		Personne ind = new Independant("Jules", "Dupont", 123234, "BE0123456789");
		System.out.println(pers);
		System.out.println(emp);
		System.out.println(ind);
	}

}

