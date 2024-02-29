public class Mgaris {
    public class Main {
        public static void main(String[] args) {
          
            Garis garis1 = new Garis(t1, t2);
    
            System.out.println("Panjang garis: " + garis1.getPanjang());
            System.out.println("Gradien garis: " + garis1.getGradien());
    
            Garis garisRefleksiY = garis1.getRefleksiY();
            System.out.println("Garis refleksi terhadap sumbu Y: titikAwal=(" + garisRefleksiY.getTitikAwal().getAbsis() + ", " + garisRefleksiY.getTitikAwal().getOrdinat() + "), titikAkhir=(" + garisRefleksiY.getTitikAkhir().getAbsis() + ", " + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");
        }
    }
}
