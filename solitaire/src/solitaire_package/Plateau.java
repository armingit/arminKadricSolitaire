package solitaire_package;



import java.util.Scanner;

/**
 * Plateau permet d'afficher et de jouer au jeu.
 * 
 * @author Kadric Armin
 * @version 1.0
 */

public class Plateau extends Plateau_europeen  {

	

	
	

	public Plateau() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Affiche le plateau normal du jeu.
     */

	public void afficherTab(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				 
				System.out.print(getPlateau_eu()[i][j]);
				System.out.print("    ");
			}
			System.out.println(" ");
		}
		
		
	}
	
	/**
     * Plateau avec moins de billes (pour le mode triche).
     */
	public void tabTriche(){
		for (int i = 2; i < 8; i = i+3) {
			for (int j = 2; j < 8; j = j+2) {
				 
				getPlateau_eu()[i][j] = "0";
				System.out.print("    ");
			}
			
			System.out.println(" ");
			
		}
		
		
	}
	
	/**
     * Affiche le plateau avec moins de billes (pour le mode triche).
     */
	public void afficherTabTriche(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				 
				System.out.print(getPlateau_eu()[i][j]);
				System.out.print("    ");
			}
			System.out.println(" ");
		}
		
		
	}
	
	
	
	Scanner sc = new Scanner(System.in);
	
	/**
     * Selection du mode de jeu (normal ou triche).
     */
	public void mode(){
		final String y;
		System.out.println("Voulez-vous activer le mode triche? Tapez Y pour OUI, n'importe quelle autre touche pour NON :");
		y = sc.next();
		
	
			if(y.equals("Y") || y.equals("y")){
				System.out.println(" ");
				System.out.println("Mode triche activé !");
				tabTriche();
				System.out.println("x = une bille  et  0 = un emplacement vide");
				System.out.println("Début de la partie !");
				afficherTabTriche();
				
			}
			
			else {
				
				System.out.println(" ");
				System.out.println("Mode normal !");
				System.out.println("x = une bille  et  0 = un emplacement vide");
				System.out.println("Début de la partie !");
				afficherTab();
			}
			
	
				
	}
	
	/**
     * La quantité de billes dans le plateau.
     * 
     * @return Retourne la variable som qui cotient la quantité de billes dans le plateau.
     */
	public int veriftab(){
		
		int som = 0;
		for (int i = 0; i < getPlateau_eu().length; i++) {
			for (int j = 0; j < getPlateau_eu().length; j++) {
				
				if(getPlateau_eu()[i][j] == "x"){
					som = som + 1;
				}
			}
		}
		return som;
	}
	
	/**
     * Demande au joueur de saisir la ligne et la colonne de la bille à déplacer ainsi que la direction pour voir si le 
     * mouvement est possible, si le mouvement est possible alors la bille est déplacer et le jeu continue jusqu'à ce qu'il
     * ne reste plus qu'une bille dans le tablier.
     */
	public void selectionLigneColonnePlay(){
	
	int ligneDepart, colonneDepart;
	do{
		do{
		
			do{
				System.out.println("Saisir le numéro de la colonne de départ :");
				colonneDepart = sc.nextInt();
				if(colonneDepart < 1 || colonneDepart > 7){
					System.out.println("Erreur ! veuillez saisir une colonne entre 1 et 7");
				}
				}
			while(colonneDepart < 1 || colonneDepart > 7);
			do{
				System.out.println("Saisir le numéro de la ligne de départ :");
				ligneDepart = sc.nextInt();
				if(ligneDepart < 1 || ligneDepart > 7){
					System.out.println("Erreur ! veuillez saisir une colonne entre 1 et 7");
				}
				}
			while(ligneDepart < 1 || ligneDepart > 7);
				if (getPlateau_eu()[ligneDepart][colonneDepart] != "x"){
					System.out.println("Ce n'est pas une bille !!!");
			}
		}
	
		while(getPlateau_eu()[ligneDepart][colonneDepart] != "x");
	
		
				
				System.out.println("Saisir la direction: (haut, bas, droite, gauche)");
				String direction = sc.next();
				mouvementBille(ligneDepart, colonneDepart, direction, getPlateau_eu());
				
		


			
			
			afficherTab();
			System.out.println("Il reste "+veriftab()+" bille(s) dans le tablier");
			
		}
	while(veriftab() > 1);
	
	if(veriftab() == 1){
		System.out.println("Victoire ! la partie est finie");
	}
		
		
		
	}
	


		
	

		
	}


