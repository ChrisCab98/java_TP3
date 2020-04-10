public class Elipse {

    protected int longueur;
    protected int largeur;

    public Elipse(int pLongueur, int pLargeur) {
        System.out.println("Contructeur par defaut d'un rectangle avec parametres");
        perimetre = 0;
        surface = 0;
        longueur = pLongueur;
        largeur = pLargeur;
    }

    public void setLongueur(int pLongueur) {
        longueur = pLongueur;
    }

    public void setLargeur(int pLargeur) {
        largeur = pLargeur;
    }

    public int getLargeur(int pLargeur) {
        return (largeur);
    }

    public int getLongueur(int pLargeur) {
        return (longueur);
    }

    public float calculPerimetre() {

        perimetre = 2 * largeur + 2 * largeur;

        System.out.println("perimetre : " + perimetre);
        return (perimetre);
    }

    public float calculSurface() {

        surface = largeur * longueur;

        System.out.println("surface : " + surface);
        return (surface);
    }

    public static void main(String argurments[]) {
        Rectangle rect = new Rectangle(3, 4);
        rect.calculPerimetre();
        rect.calculSurface();
    }

}