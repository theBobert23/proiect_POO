public class Spital extends Cladire {
    private String nume;
    private int numarPaturi;
    private int numarMedici;
    private int numarSectii;
    private String oras;


    public Spital() {
        super();
        this.nume = "Spitalul de Urgență Galati";
        this.numarPaturi = 50;
        this.numarMedici = 15;
        this.numarSectii = 4;
        this.oras = "Galati";
    }


    public Spital(String adresa, int numarEtaje, double inaltime,
                  String nume, int numarPaturi, int numarMedici, int numarSectii, String oras) {
        super(adresa, numarEtaje, inaltime);
        this.nume = nume;
        this.numarPaturi = numarPaturi;
        this.numarMedici = numarMedici;
        this.numarSectii = numarSectii;
        this.oras = oras;
    }


    public Spital(Spital sp) {
        super(sp);
        this.nume = sp.nume;
        this.numarPaturi = sp.numarPaturi;
        this.numarMedici = sp.numarMedici;
        this.numarSectii = sp.numarSectii;
        this.oras = sp.oras;
    }


    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public int getNumarPaturi() { return numarPaturi; }
    public void setNumarPaturi(int numarPaturi) { this.numarPaturi = numarPaturi; }

    public int getNumarMedici() { return numarMedici; }
    public void setNumarMedici(int numarMedici) { this.numarMedici = numarMedici; }

    public int getNumarSectii() { return numarSectii; }
    public void setNumarSectii(int numarSectii) { this.numarSectii = numarSectii; }

    public String getOras() { return oras; }
    public void setOras(String oras) { this.oras = oras; }


    public void verificaCapacitateSpital() {
        if (numarPaturi > 200) {
            System.out.println("Spital cu capacitate mare.");
        } else {
            System.out.println("Spital cu capacitate mica.");
        }
    }

    @Override
    public String toString() {
        return "Spital: " + nume + ", Oras: " + oras + ", Paturi: " + numarPaturi +
                ", Medici: " + numarMedici + ", Sectii: " + numarSectii + " | " + super.toString();
    }
}