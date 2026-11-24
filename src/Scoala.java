public class Scoala extends Cladire {
    private String nume;
    private int numarElevi;
    private int numarProfesori;
    private int numarClase;
    private String profil;


    public Scoala() {
        super();
        this.nume = "Scoala nr. 1";
        this.numarElevi = 100;
        this.numarProfesori = 10;
        this.numarClase = 5;
        this.profil = "General";
    }


    public Scoala(String adresa, int numarEtaje, double inaltime,
                  String nume, int numarElevi, int numarProfesori, int numarClase, String profil) {
        super(adresa, numarEtaje, inaltime);
        this.nume = nume;
        this.numarElevi = numarElevi;
        this.numarProfesori = numarProfesori;
        this.numarClase = numarClase;
        this.profil = profil;
    }


    public Scoala(Scoala s) {
        super(s);
        this.nume = s.nume;
        this.numarElevi = s.numarElevi;
        this.numarProfesori = s.numarProfesori;
        this.numarClase = s.numarClase;
        this.profil = s.profil;
    }


    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public int getNumarElevi() { return numarElevi; }
    public void setNumarElevi(int numarElevi) { this.numarElevi = numarElevi; }

    public int getNumarProfesori() { return numarProfesori; }
    public void setNumarProfesori(int numarProfesori) { this.numarProfesori = numarProfesori; }

    public int getNumarClase() { return numarClase; }
    public void setNumarClase(int numarClase) { this.numarClase = numarClase; }

    public String getProfil() { return profil; }
    public void setProfil(String profil) { this.profil = profil; }


    public void verificaDimensiuneScoala() {
        if (numarElevi > 500) {
            System.out.println("Scoala mare.");
        } else {
            System.out.println("Scoala mica.");
        }
    }

    @Override
    public String toString() {
        return "Scoala: " + nume + ", Profil: " + profil + ", Elevi: " + numarElevi +
                ", Profesori: " + numarProfesori + ", Clase: " + numarClase + " | " + super.toString();
    }
}