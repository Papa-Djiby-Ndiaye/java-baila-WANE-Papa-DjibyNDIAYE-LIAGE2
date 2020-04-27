public class Rectangle {
    public static void main(string[] args){

       scanner scan = new scanner (system.in); 
	   
	   double longueur,largeur,resultat;
	   int choix;
	    scanner scnbre1 = new scanner (system.in); 
		scanner scnbre2 = new scanner (system.in); 
		scanner scchoix = new scanner (system.in); 
		system.out.println("choix");
		system.out.println("1) perimetre");
		system.out.println("2) demi-perimetre");
		system.out.println("3) surface");
		system.out.println("4) diagonale");
		
		choix = scchoix.nextInt();
		
		switch (choix){
			case 1:
					system.out.println("saisir longueur : ");
					nbre1 = scnbre1.nextDouble();
					system.out.println("saisir largeur : ");
					nbre2 = scnbre2.nextDouble();
					resultat = (longueur + largeur)*2;
					system.out.println("le perimetre est :" +resultat);
				break;
				
			case 2:
					system.out.println("saisir longueur : ");
					nbre1 = scnbre1.nextDouble();
					system.out.println("saisir largeur : ");
					nbre2 = scnbre2.nextDouble();
					resultat = longueur + largeur;
					system.out.println("le demi-perimetre est :" +resultat)
				break;
				
			case 3:
					system.out.println("saisir longueur : ");
					nbre1 = scnbre1.nextDouble();
					system.out.println("saisir largeur : ");
					nbre2 = scnbre2.nextDouble();
					resultat = longueur * largeur;
					system.out.println("la surface est :" +resultat)
				break;
			case 4:
					system.out.println("saisir longueur : ");
					nbre1 = scnbre1.nextDouble();
					system.out.println("saisir largeur : ");
					nbre2 = scnbre2.nextDouble();
					resultat = sqrt((longueur*longueur)+(largeur*largeur));
					system.out.println("la diagonale est :" +resultat)
			break;
		 
		}
		
    }
}