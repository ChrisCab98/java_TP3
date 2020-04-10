public class EtreVivant {

    protected String nom;
    protected String espece;

    public EtreVivant() {
        nom = "untitle";
        espece = "untitle";
    }

    public EtreVivant(String pNom,String pEspece) {
        nom = pNom;
        espece = pEspece;
    }

    public String toString() {
        String str = "";
        str += "Nom:" + nom + " espece:" + espece;

        return str;
    }

    public static void main(String arguments[]) {
        EtreVivant chris = new EtreVivant("Chris","Humain");
        System.out.println(chris);
    }

}
