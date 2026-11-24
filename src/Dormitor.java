public class Dormitor extends Camera {

    private String tipPat;
    private int nrDulapuri;
    private boolean balcon;
    private boolean televizor;
    private double temperaturaPreferata;

    public Dormitor() {
        super();
        tipPat = "single";
        nrDulapuri = 1;
        balcon = false;
        televizor = false;
        temperaturaPreferata = 21.0;
    }

    public Dormitor(Camera c, String tipPat, int nrDulapuri, boolean balcon, boolean televizor, double temperaturaPreferata) {
        super(c);
        this.tipPat = tipPat;
        this.nrDulapuri = nrDulapuri;
        this.balcon = balcon;
        this.televizor = televizor;
        this.temperaturaPreferata = temperaturaPreferata;
    }

    public Dormitor(Dormitor d) {
        super(d);
        tipPat = d.tipPat;
        nrDulapuri = d.nrDulapuri;
        balcon = d.balcon;
        televizor = d.televizor;
        temperaturaPreferata = d.temperaturaPreferata;
    }

    public String getTipPat() {
        return tipPat;
    }

    public void setTipPat(String tipPat) {
        this.tipPat = tipPat;
    }

    public int getNrDulapuri() {
        return nrDulapuri;
    }

    public void setNrDulapuri(int nrDulapuri) {
        this.nrDulapuri = nrDulapuri;
    }

    public boolean areBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public boolean areTelevizor() {
        return televizor;
    }

    public void setTelevizor(boolean televizor) {
        this.televizor = televizor;
    }

    public double getTemperaturaPreferata() {
        return temperaturaPreferata;
    }

    public void setTemperaturaPreferata(double temperaturaPreferata) {
        this.temperaturaPreferata = temperaturaPreferata;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip: Dormitor | Pat: " + tipPat +
                ", Dulapuri: " + nrDulapuri + ", Balcon: " + (balcon ? "Da" : "Nu") +
                ", TV: " + (televizor ? "Da" : "Nu") + ", Temp. preferata: " + temperaturaPreferata + "°C.";
    }

    @Override
    public void afisareInformatii() {
        System.out.println(this.toString());
    }
}