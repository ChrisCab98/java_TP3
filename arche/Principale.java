public class Principale {

    public Principale() {
        // tableau = new EtreVivant[10];
    }

    public static void main(String arguments[]) {

        EtreVivant tableau[] = new EtreVivant[5];

        tableau[0] = new Lion("Alexis", 12);
        tableau[1] = new EtreVivant("Kermit", "Grenouille");
        tableau[2] = new Vache("Marguerite", 1);
        tableau[3] = new EtreVivant("COVID19", "Virus");
        tableau[4] = new EtreVivant("ISEN", "Virus");

        for (int i = 0; i < 5; i++) {
            System.out.println(tableau[i]);
            System.out.println("");
        }

    }

}