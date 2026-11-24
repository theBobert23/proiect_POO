public class Bucatarie extends Camera {

    private int locuriMasa;
    private int cantCafea;
    private boolean hota;
    private int nrArzatoare;
    private String tipBlat;

    public Bucatarie() {
        super();
        locuriMasa = 4;
        cantCafea = 0;
        hota = false;
        nrArzatoare = 4;
        tipBlat = "laminat";
    }

    public Bucatarie(Camera c, int locuri, int cafea, boolean hota, int nrArzatoare, String tipBlat) {
        super(c);
        setLocuriMasa(locuri);
        if (cafea < 0)
            throw new RuntimeException("Cantitate negativa invalida pentru cantitate cafea.");
        cantCafea = cafea;
        this.hota = hota;
        this.nrArzatoare = nrArzatoare;
        this.tipBlat = tipBlat;
    }

    public Bucatarie(Bucatarie b) {
        super(b);
        locuriMasa = b.locuriMasa;
        cantCafea = b.cantCafea;
        hota = b.hota;
        nrArzatoare = b.nrArzatoare;
        tipBlat = b.tipBlat;
    }

    public int getLocuriMasa() {
        return locuriMasa;
    }

    public void setLocuriMasa(int nr) {
        if (nr <= 0) {
            throw new RuntimeException("Valoare pt locuri la masa, pentru camera " + numar + " invalida: " + nr);
        }
        locuriMasa = nr;
    }

    public int getCantCafea() {
        return cantCafea;
    }

    public void setCantCafea(int cantCafea) {
        if (cantCafea < 0)
            throw new RuntimeException("Cantitate negativa invalida pentru cantitate cafea.");
        this.cantCafea = cantCafea;
    }

    public boolean areHota() {
        return hota;
    }

    public void setHota(boolean hota) {
        this.hota = hota;
    }

    public int getNrArzatoare() {
        return nrArzatoare;
    }

    public void setNrArzatoare(int nrArzatoare) {
        this.nrArzatoare = nrArzatoare;
    }

    public String getTipBlat() {
        return tipBlat;
    }

    public void setTipBlat(String tipBlat) {
        this.tipBlat = tipBlat;
    }

    public void cumparaCafea(int cantitate) {
        if (cantitate < 0)
            throw new RuntimeException("Cantitate negativa invalida pentru cantitate cafea.");
        cantCafea += cantitate;
    }

    public void pregatesteCafea(int nrPersoane) {
        int cantNecesara = nrPersoane * 10; // 10g de cafea praf pt o ceasca de cafea
        if (cantNecesara > cantCafea)
            throw new RuntimeException("Prea multe cafele.");
        cantCafea -= cantNecesara;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip: Bucatarie | Locuri masa: " + locuriMasa +
                ", Cafea: " + cantCafea + "g, Hota: " + (hota ? "Da" : "Nu") +
                ", Arzatoare: " + nrArzatoare + ", Blat: " + tipBlat + ".";
    }

    @Override
    public void afisareInformatii() {
        System.out.println(this.toString());
    }
}