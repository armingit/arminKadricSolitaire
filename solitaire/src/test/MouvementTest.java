package test;

import static org.junit.Assert.*;

import org.junit.Test;
import solitaire_package.Plateau_europeen;

public class MouvementTest extends Plateau_europeen {
/**
 * Ce test vérifie le déplacement d'une bille de la case (4,6).
 */
	@Test
	public void testMouvementBille() {
		mouvementBille(4,6,"haut",getPlateau_eu());
		String resultatAttendu = "x";
		assertTrue(getPlateau_eu()[4][6] == resultatAttendu);
		assertFalse(getPlateau_eu()[4][6] != resultatAttendu);
	}

}
