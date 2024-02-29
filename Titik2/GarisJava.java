public class Garis {
  private Titik titikAwal;
  private Titik titikAkhir;

  public Garis(Titik titikAwal, Titik titikAkhir) {
      this.titikAwal = titikAwal;
      this.titikAkhir = titikAkhir;
  }

  public Titik getTitikAwal() {
      return titikAwal;
  }

  public Titik getTitikAkhir() {
      return titikAkhir;
  }

  public void setTitikAwal(Titik titikAwal) {
      this.titikAwal = titikAwal;
  }

  public void setTitikAkhir(Titik titikAkhir) {
      this.titikAkhir = titikAkhir;
  }

  public double getPanjang() {
      double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
      double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
      return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
  }

  public double getGradien() {
      double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
      double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
     
       return dy / dx;
 
  }

  public Garis getRefleksiY() {
      Titik titikAwalRefleksi = titikAwal.getRefleksiY();
      Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();
      return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
  }

  public boolean isTegakLurus(Garis G) {
      double gradien1 = this.getGradien();
      double gradien2 = G.getGradien();
 
      return (gradien1 * gradien2) == -1;
  }
}