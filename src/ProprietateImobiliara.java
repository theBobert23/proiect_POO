public class ProprietateImobiliara implements Interfata {
    private String adresa;
    private double suprafata;
    private int anConstructie;
    private double pretPeMetruPatrat;

    public ProprietateImobiliara() {
        this.adresa = "necunoscuta";
        this.suprafata = 0;
        this.anConstructie = 2000;
        this.pretPeMetruPatrat = 1000;
    }

    public ProprietateImobiliara(String adresa, double suprafata) {
        this.adresa = adresa;
        this.suprafata = suprafata;
        this.anConstructie = 2000;
        this.pretPeMetruPatrat = 1000;
    }
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    public int getAnConstructie() {
        return anConstructie;
    }

    public void setAnConstructie(int anConstructie) {
        this.anConstructie = anConstructie;
    }

    public double getPretPeMetruPatrat() {
        return pretPeMetruPatrat;
    }

    public void setPretPeMetruPatrat(double pretPeMetruPatrat) {
        this.pretPeMetruPatrat = pretPeMetruPatrat;
    }

    public int calculeazaVechime(int anCurent) {
        return anCurent - anConstructie;
    }

    public boolean esteNoua() {
        return anConstructie >= 2020;
    }
@Override
    public void afiseazaDetalii() {
        System.out.println("Adresa: " + adresa);
        System.out.println("Suprafata: " + suprafata);
        System.out.println("An constructie: " + anConstructie);
        System.out.println("Pret pe mp: " + pretPeMetruPatrat);
    }
    @Override
    public double calculeazaPret() {
        return suprafata * pretPeMetruPatrat;
    }
}
