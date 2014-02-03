package test;

import static org.junit.Assert.*;

import org.junit.Test;

import solitaire_package.Plateau;

public class PlateauTest extends Plateau {
/**
 * Permet de vérifier si le tableau contient bien les billes et les trous.
 */
	@Test
	public void testAfficherTab() {
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				if((i== 2 && j == 2) || (i==2 && j==6) || (i==6 && j==2) || (i==6 && j==6) ){
					assertTrue(getPlateau_eu()[i][j] == "x");
				}
				else if ((i<3 && j<3) || (i<3 && j>5) || (i>5 && j<3) || (i>5 && j>5)) {
					assertTrue(getPlateau_eu()[i][j] == " ");
			
				}
				else {
					
					assertTrue(getPlateau_eu()[i][j] == "x" || getPlateau_eu()[i][j] == "0");
				}
			}
		
	    }
		
		
	}
/**
 * Permet de vérifier que le tablier du mode triche contient bien moins de 36 billes
 */
	@Test
	public void testTabTriche() {
		int billeTotal = 36;
		tabTriche();
		assertTrue(veriftab() < billeTotal);
		assertFalse(veriftab() > billeTotal);
	}
/**
 * Permet de vérifier que l'affichage du tablier en mode triche possède bien 30 billes et non 36, 
 * dans ce cas le mode triche s'affiche correctement.
 */
	@Test
	public void testAfficherTabTriche() {
		int billeTotal = 30;
		tabTriche();
		assertTrue(veriftab() == billeTotal);
		
	}

/**
 * Permet de vérifier que la fonction veriftab() vérifie bien le nombre de billes dans le tablier
 */
	@Test
	public void testVeriftab() {
		int billeTotal = 36;
		assertTrue(veriftab() == billeTotal);
	}





}
