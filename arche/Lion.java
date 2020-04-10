public class Lion extends Carnivore {

    private int consoViandeJour;

    public Lion() {
        consoViandeJour = 0;
    }

    public Lion(String pNom, int pconsoViandeJour) {
        super(100, 150, 15);
        nom = pNom;
        espece = "Carnivore";
        consoViandeJour = pconsoViandeJour;
    }

    public String toString() {
        String str = "";
        str += super.toString();
        str += "\nJe suis un lion\nje mange " + consoViandeJour + "kg/jours";

        return str;

    }

    public static void main(String arguments[]) {
        Lion alex = new Lion("Alex", 10);
        System.out.println(alex);
    }

}