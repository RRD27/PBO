//Raden Rico Dwianda
//24060122140184
//Mengimplementasikan enkapsulasi
import java.lang.Math;
public class Titik {
    public double absis;
    public double ordinat;

    public  Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;

    }

    public Titik () {
        this(0,0 );
    }

    public void setAbsis(double abs){
        absis = abs;
    }

    public void setOrdinat(double ord) {
        ordinat = ord;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public double getAbsis () {
        return absis;
    }

  public double getJarakPusat() {
      return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
  }

  public void refleksiX() {
      ordinat *= -1;
  }

  public void refleksiY() {
      absis *= -1;
  }

  public Titik getRefleksiX() {
      return new Titik(absis, -ordinat);
  }

  public Titik getRefleksiY() {
      return new Titik(-absis, ordinat);
  }

}