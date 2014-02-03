package solitaire_package;
/**
 * Plateau_solitaire permet la création du tablier de type Européen.
 * 
 * @author Kadric Armin
 * @version 1.0
 */
public class Plateau_europeen extends Mouvement {
	
	/**
     * Tableau de string qui est le tablier de jeu du solitaire.
     */
	private String plateau_eu[][] = new String[8][8];{
	
	for (int i = 1; i < 8; i++) {
			getPlateau_eu()[0][0] = " ";
			getPlateau_eu()[i][0] = ""+i;
			for (int j = 1; j < 8; j++) {
				getPlateau_eu()[0][j] = ""+j;
			}
		
	}
	
	for (int i = 1; i < 8; i++) {
		for (int j = 1; j < 8; j++) {
			if((i== 2 && j == 2) || (i==2 && j==6) || (i==6 && j==2) || (i==6 && j==6) ){
				getPlateau_eu()[i][j] = "x";
			}
			else if ((i<3 && j<3) || (i<3 && j>5) || (i>5 && j<3) || (i>5 && j>5)) {
			getPlateau_eu()[i][j] = " ";
		
			}
			else {
			 getPlateau_eu()[i][j] = "x";
			}
		}
	
    }
	
	
	

	

	
	getPlateau_eu()[4][4] = "0";

	

	}

	public String[][] getPlateau_eu() {
		return plateau_eu;
	}

	public void setPlateau_eu(String plateau_eu[][]) {
		this.plateau_eu = plateau_eu;
	}


	

	
	

}
	
