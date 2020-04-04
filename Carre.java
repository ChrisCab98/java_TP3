public class Carre extends Rectangle {

    public Carre(int pLongueur) {
        System.out.println("Constructeur par defaut d'un carré");
        longueur = pLongueur;
        largeur = pLongueur;
    }

    public static void main(String arguments[]) {
        Carre monCarre = new Carre(3);
        monCarre.calculPerimetre();
        monCarre.calculSurface();
    }

}