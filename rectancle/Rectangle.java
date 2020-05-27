/**
 * Rectangle
 */
public class Rectangle {

    public static void main(String[] args) {

        double demi_perimetre;
        double perimetre;
        double surface;
        double diagonale;
        double longueur=12.0;
        double largeur=10.0;

        demi_perimetre=longueur+largeur;
        perimetre=2*demi_perimetre;
        surface=longueur*largeur;
        diagonale=Math.sqrt(longueur*longueur+largeur*largeur);

        System.out.println("Le demi-perimetre est :"+demi_perimetre);
        System.out.println("Le perimetre est :"+perimetre);
        System.out.println("La surface est :"+surface);
        System.out.println("La diagonale est :"+diagonale); 

        
    }

    
}