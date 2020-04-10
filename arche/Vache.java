public class Vache extends Herbivore {

    private int productionDeLait;

    public Vache() {
        productionDeLait = 0;
    }

    public Vache(String pNom, int pProductionDeLait) {
        super(100, 200, 20);
        nom = pNom;
        espece = "Herbivore";
        productionDeLait = pProductionDeLait;
    }

    public String toString() {
        String str = "";
        str += super.toString();
        str += "\nJe suis un vache\nje produit " + productionDeLait + "l/jours";

        return str;
    }

    public static void main(String arguments[]) {
        Vache marguerite = new Vache("Marguerite", 10);
        System.out.println(marguerite);
    }

}