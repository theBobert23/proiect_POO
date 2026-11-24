public class Bloc extends Cladire {

    private int numarApartamente;
    private int numarScari;
    private boolean lift;
    private int anConstructie;
    private boolean parcare;

    public Bloc() {
        super();
    }

    public Bloc(String adresa, int numarEtaje,
                double inaltime, int numarApartamente,
                int numarScari, boolean lift,
                int anConstructie, boolean parcare) {

        super(adresa, numarEtaje, inaltime);

        this.numarApartamente = numarApartamente;
        this.numarScari = numarScari;
        this.lift = lift;
        this.anConstructie = anConstructie;
        this.parcare = parcare;
    }

    public Bloc(Bloc b) {
        super(b.adresa, b.numarEtaje, b.inaltime);

        this.numarApartamente = b.numarApartamente;
        this.numarScari = b.numarScari;
        this.lift = b.lift;
        this.anConstructie = b.anConstructie;
        this.parcare = b.parcare;
    }

    public int getNumarApartamente() {
        return numarApartamente;
    }

    public void setNumarApartamente(int numarApartamente) {
        this.numarApartamente = numarApartamente;
    }

    public int getNumarScari() {
        return numarScari;
    }

    public void setNumarScari(int numarScari) {
        this.numarScari = numarScari;
    }

    public boolean getLift() {
        return lift;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public int getAnConstructie() {
        return anConstructie;
    }

    public void setAnConstructie(int anConstructie) {
        this.anConstructie = anConstructie;
    }

    public boolean getParcare() {
        return parcare;
    }

    public void setParcare(boolean parcare) {
        this.parcare = parcare;
    }

    @Override
    public String toString() {
        return "Bloc: " + adresa
                + ", Etaje: " + numarEtaje
                + ", Inaltime: " + inaltime
                + ", Apartamente: " + numarApartamente
                + ", Scari: " + numarScari
                + ", Lift: " + lift
                + ", An constructie: " + anConstructie
                + ", Parcare: " + parcare;
    }
}
