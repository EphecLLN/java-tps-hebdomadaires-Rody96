package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EtudiantTest {

	@Test
	void testMoyenne() {
		Date d = new Date(01,01,2001);
		int [] tab = {15,13,9,11};
		Etudiant etu = new Etudiant("Dubois", "Jean", tab, d);
		assertEquals(12.0,etu.moyenne(tab));
	}

}
