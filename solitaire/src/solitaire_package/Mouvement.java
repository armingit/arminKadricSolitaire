package solitaire_package;
/**
 * Mouvement permet le déplacement d'une bille.
 * 
 * @author Kadric Armin
 * @version 1.0
 */
public class Mouvement {
	
	/**
     * Permet de déplacement de la bille.
     * 
     * @param i
     *            Le numéro de la ligne.
     * @param j
     *            Le numéro de la colonne.
     * @param direction
     *            La direction du déplacement.
     * @param tab
     *            Le tablier du jeu.
     */
	public static void mouvementBille(int i, int j, String direction, String tab[][]){
		try{
			if(direction.equals("haut")){
				if(tab[i-2][j] == "0" && tab[i-1][j] == "x"){
					
					
					tab[i][j] = "0";
					tab[i-1][j] = "0";
					tab[i-2][j] = "x";
				}
				else System.out.println("Ce mouvement n'est pas possible !!!");
				
			}
			else if(direction.equals("bas")){
				if(tab[i+2][j] == "0" && tab[i+1][j] == "x"){
					
					tab[i][j] = "0";
					tab[i+1][j] = "0";
					tab[i+2][j] = "x";
				}
				else System.out.println("Ce mouvement n'est pas possible !!!");
			}
			else if(direction.equals("droite")){
				if(tab[i][j+2] == "0" && tab[i][j+1] == "x"){
					
					tab[i][j] = "0";
					tab[i][j+1] = "0";
					tab[i][j+2] = "x";
				}
				else System.out.println("Ce mouvement n'est pas possible !!!");
				
				
			}
			else if(direction.equals("gauche")){
				if(tab[i][j-2] == "0" && tab[i][j-1] == "x"){
					
					tab[i][j] = "0";
					tab[i][j-1] = "0";
					tab[i][j-2] = "x";
				}
				else System.out.println("Ce mouvement n'est pas possible !!!");
		
			}
			else System.out.println("Mauvaise direction !");
		 }
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Erreur !!! ce mouvement sort du tablier de jeu !!!");
		}
		}

}
