//Nama		: Raden Rico Dwianda
//NIM		: 24060122140184
//Tanggal	: 6 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk class AngkaSialException
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * this.jariJari;
        return keliling;
    }

}
