public class Cladire implements Informatii {

    String adresa;
    int numarEtaje;
    double inaltime;

    public Cladire(String adresa, int numarEtaje, double inaltime) {
        this.adresa = adresa;
        this.numarEtaje = numarEtaje;
        this.inaltime = inaltime;
    }

    public void verificaLift() {
        if (numarEtaje > 3) {
            System.out.println("Cladirea ar putea avea lift.");
        } else {
            System.out.println("Cladirea nu necesita lift.");
        }
    }

    public void afiseazaTipCladire() {
        if (numarEtaje > 4) {
            System.out.println("Cladire inalta.");
        } else {
            System.out.println("Cladire joasa.");
        }
    }

    @Override
    public void afisareInformatii() {
        System.out.println("Adresa: " + adresa);
        System.out.println("Numar etaje: " + numarEtaje);
        System.out.println("Inaltime: " + inaltime + " metri");
    }

    @Override
    public double calculeazaInaltimeTotala() {
        return inaltime * numarEtaje;
    }
}
