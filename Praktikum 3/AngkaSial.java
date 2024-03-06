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
            as.cobaAngka(15);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (Exception Ase) {
            // Method getMessage() telah bekerja pada kelas "Exception"
            System.out.println(Ase.getMessage());
            System.out.println("hati-hati memasukan angka!!!");
        }
    }
}
//line (System.out.println(angka + " bukan angka sial"); di eksekusi ketika main mengeksekusi try ke-1, yaitu as.cobaAngka(15).//
//Karena angka tersebut bukan 13, seehingga tidak memenuhi kondisi if dan langsung mencetak angka (15) bukan angka sial.//
//line catch (Exception Ase) { di eksekusi ketika main mengeksekusi try ke-2, yaitu as.cobaAngka(13).//
//Karena dia akan masuk ke kondisi if pada method cobaAngka yang menghasilkan throw baru yang mencetak message dari method AngkaSialException.//
//Dan kemudian ditangkan oleh catch dan mencetak hati-hati dalam memasukan angka.//
