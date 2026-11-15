public class Cladire implements Informatii {

    String adresa;
    int numarEtaje;
    double inaltime;

    public Cladire(String adresa, int numarEtaje, double inaltime) {
        this.adresa = adresa;
        this.numarEtaje = numarEtaje;
        this.inaltime = inaltime;
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
