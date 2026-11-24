public class Camera implements Securizabil,Informatii {

  static int numar;
  private double lungime, latime, inaltime;
  private int nrFerestre;
  private boolean lumina;
  private String culoarePereti;
  
  //pt Securizabil
  private boolean incuiata;
  private String codAcces;

  public Camera(){
    numar++;
    setMarime(10, 10, 10);
    nrFerestre = 0;
    lumina = false;
    culoarePereti = "nevopsiti";
    incuiata = false;
    codAcces = "0000";
  }

  public Camera(double lun, double lat, double h, int nrFerestre, boolean lumina, String culoare, String cod){
    numar++;
    setMarime(lun, lat, h);
    this.nrFerestre = nrFerestre;
    this.lumina = lumina;
    culoarePereti = culoare;
    incuiata = false;
    codAcces = cod;
  }

  public Camera(Camera c){
    numar++;
    setMarime(c.lungime, c.latime, c.inaltime);
    nrFerestre = c.nrFerestre;
    lumina = c.lumina;
    culoarePereti = c.culoarePereti;
    incuiata = c.incuiata;
    codAcces = c.codAcces;
  }

  public void setMarime(double lungime, double latime, double inaltime){
    
    if(lungime <= 0 || latime <= 0 || inaltime <= 0)
      throw new RuntimeException("Marimi invalide pentru camera " + numar);

    this.lungime = lungime;
    this.latime = latime;
    this.inaltime = inaltime;

  }

  public double getSuprafata(){
    return lungime*latime;
  }

  //Pentru interfata Securizabil
  @Override
  public void incuie(){
    incuiata = true;
  }

  @Override
  public void descuie(String codAcces){
    if(!incuiata){
      System.out.println("Camera " + numar + "este deja deschisa.");
      return;
    }
    if(codAcces.equals(this.codAcces)){
      incuiata = false;
      System.out.println("Camera " + numar + " descuiata.");
    }
    else
      System.out.println("Cod invalid pentru camera " + numar);
  }

  @Override
  public boolean esteIncuiata(){
    return incuiata;
  }

  @Override
  public String toString(){
    return "Camera " + ", este de " + lungime + "x" + latime + "x" + inaltime + ".\nAre " + nrFerestre + " ferestre, si peretii " + culoarePereti + ".";
  }

  @Override
  public void afisareInformatii(){
    System.out.println("Camera " + ", este de " + lungime + "x" + latime + "x" + inaltime + ".\nAre " + nrFerestre + " ferestre, si peretii " + culoarePereti + ".");
  }

  @Override
  public double calculeazaInaltimeTotala(){
    double h = 0;

    return h;
  }

  //public abstract double getConsum();
  //public abstract void activeazaModVacanta();

}