package tp3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExempleTest {

	@Test
	public void testIsPair() {
		Exemple e = new Exemple();
		assertTrue(e.isPair(84));
	}

	@Test
	public void testPerimetreCarre() {
		Exemple e = new Exemple();
		assertEquals(16, e.perimetreCarre(4));
	}

	@Test
	public void testContientCaractere() {
		Exemple e = new Exemple();
		assertTrue(e.contientCaractere('n',"ananas"));
	}

}
