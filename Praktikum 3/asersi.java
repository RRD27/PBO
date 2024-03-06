//Nama		: Raden Rico Dwianda
//NIM		: 24060122140184
//Tanggal	: 6 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk class Asersi
public class Asersi {
    public static void main(String[] args) {
        double jariJari = 0;

        assert jariJari > 0 : "Jari-jari harus lebih besar dari 0";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
    }
}
