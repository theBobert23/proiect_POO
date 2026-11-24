public class Casa extends Cladire {

    private int numarCamere;
    private double suprafata;
    private boolean gradina;
    private boolean garaj;
    private String material;

    public Casa() {
        super();
    }

    public Casa(String adresa, int numarEtaje,
                double inaltime, int numarCamere,
                double suprafata, boolean gradina,
                boolean garaj, String material) {

        super(adresa, numarEtaje, inaltime);

        this.numarCamere = numarCamere;
        this.suprafata = suprafata;
        this.gradina = gradina;
        this.garaj = garaj;
        this.material = material;
    }

    public Casa(Casa c) {
        super(c.adresa, c.numarEtaje, c.inaltime);

        this.numarCamere = c.numarCamere;
        this.suprafata = c.suprafata;
        this.gradina = c.gradina;
        this.garaj = c.garaj;
        this.material = c.material;
    }

    public int getNumarCamere() {
        return numarCamere;
    }

    public void setNumarCamere(int numarCamere) {
        this.numarCamere = numarCamere;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    public boolean getGradina() {
        return gradina;
    }

    public void setGradina(boolean gradina) {
        this.gradina = gradina;
    }

    public boolean getGaraj() {
        return garaj;
    }

    public void setGaraj(boolean garaj) {
        this.garaj = garaj;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Casa: " + adresa
                + ", Etaje: " + numarEtaje
                + ", Inaltime: " + inaltime
                + ", Camere: " + numarCamere
                + ", Suprafata: " + suprafata
                + ", Gradina: " + gradina
                + ", Garaj: " + garaj
                + ", Material: " + material;
    }
}