//Nama		: Raden Rico Dwianda
//NIM		: 24060122140184
//Tanggal	: 6 Maret 2024
//Deskripsi	: Class yang berisi program utama untuk class AngkaSial
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (Exception Ase) {
            // Method getMessage() telah bekerja pada kelas "Exception"
            System.out.println(Ase.getMessage());
            System.out.println("hati-hati memasukan angka!!!");
        }
    }
}
