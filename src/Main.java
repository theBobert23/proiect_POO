
public class Main {
    public static void main(String[] args) {

        Cladire c1 = new Cladire("Galati", 6, 3.5);

        c1.afisareInformatii();

        System.out.println("Inaltime totala: "
                + c1.calculeazaInaltimeTotala() + " metri");
    }
}
