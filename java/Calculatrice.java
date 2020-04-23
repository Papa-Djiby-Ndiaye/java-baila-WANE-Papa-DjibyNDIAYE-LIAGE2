
public class Calculatrice {
    public static void main(string[] args){

       scanner scan = new scanner (system.in); 
	   
	   double nbre1,nbre2,resultat;
	   int choix;
	    scanner scnbre1 = new scanner (system.in); 
		scanner scnbre2 = new scanner (system.in); 
		scanner scchoix = new scanner (system.in); 
		system.out.println("choix");
		system.out.println("1) addition");
		system.out.println("2) produit");
		system.out.println("3) quotient");
		
		choix = scchoix.nextInt();
		
		switch (choix){
			case 1:
					system.out.println("saisir premier nombre : ");
					nbre1 = scnbre1.nextDouble();
					system.out.println("saisir second nombre : ");
					nbre2 = scnbre2.nextDouble();
					resultat = nbre1 + nbre2;
					system.out.println("le resultat est :" +resultat);
				break;
				
			case 2:
					system.out.println("saisir premier nombre : ");
					nbre1 = scnbre1.nextDouble();
					system.out.println("saisir second nombre : ");
					nbre2 = scnbre2.nextDouble();
					resultat = nbre1 * nbre2;
					system.out.println("le resultat est :" +resultat)
				break;
				
			case 3:
					system.out.println("saisir premier nombre : ");
					nbre1 = scnbre1.nextDouble();
					system.out.println("saisir second nombre : ");
					nbre2 = scnbre2.nextDouble();
					resultat = nbre1 / nbre2;
					system.out.println("le resultat est :" +resultat)
				break;
		 
		}
		
    }
}