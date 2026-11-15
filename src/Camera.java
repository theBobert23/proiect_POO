public abstract class Camera {

  static int numar;
  private double lungime, latime, inaltime;
  private int nrFerestre;
  private bool lumina;
  private String culoarePereti;

  public Camera(){
    numar++;
    setMarime(10, 10, 10);
    nrFerestre = 0;
    lumina = false;
    culoarePereti = "nevopsiti";
  }

  public Camera(double lun, double lat, double h, int nrFerestre, bool lumina, String culoare){
    numar++;
    setMarime(lun, lat, h);
    this.nrFerestre = nrFerestre;
    this.lumina = lumina;
    culoarePereti = culoare;
  }

  public Camera(Camera c){
    numar++;
    setMarime(c.lungime, c.latime, c.inaltime);
    nrFerestre = c.nrFerestre;
    lumina = c.lumina;
    culoarePereti = c.culoarePereti;
  }

  public void setMarime(double lungime, double latime, double inaltime){
    
    if(lungime <= 0 || latime <= 0 || inaltime <= 0)
      throw new RuntimeException("Marimi invalide pentru camera" + numar);

    this.lungime = lungime;
    this.latime = latime;
    this.inaltime = inaltime;

  }

  public double getSuprafata(){
    return lungime*latime;
  }

  @Override
  public String toString(){
    return "Camera " + numar + ", este de " + lungime + "x" + latime + "x" + inaltime + ".\nAre " + nrFerestre + " ferestre, si peretii " + culoarePereti + ".";
  }

  public abstract double getConsum();
  public abstract void activeazaModVacanta();

}
