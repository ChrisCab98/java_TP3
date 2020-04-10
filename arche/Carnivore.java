public class Carnivore extends EtreVivant {

    protected int taille;
    protected int poid;
    protected int dureeDeVie;

    public Carnivore() {
        taille = 0;
        poid = 0;
        dureeDeVie = 0;
    }

    public Carnivore(int pTaille, int pPoid, int pDureeDeVie) {
        super("Chris", "Humain");
        // super.toString();
        taille = pTaille;
        poid = pPoid;
        dureeDeVie = pDureeDeVie;
    }

    public String toString() {

        String str = "";
        str += super.toString();
        str += "\nJe suis un carnivore\nje mesure: " + taille + " cm\nje pèse: " + poid
                + " kg\nj'ai une durée de vie de: " + dureeDeVie + " ans";

        return str;
    }

    public static void main(String arguments[]) {
        Carnivore christopher = new Carnivore(12, 3, 3);
        System.out.println(christopher);

    }
}
