import org.mahasiswa.*;
import org.walimahasiswa.*;

//Nama: Rico DWianda
//NIM : 24060122140184
//LAB : C1

class Main {
  public static void main(String[] args) {
      WaliMahasiswa wali = new WaliMahasiswa("Raden", "124060122140184", "911", "Jl. Jalan");
      Mahasiswa mahasiswa = new Mahasiswa("Rico", "24060122140184", "Jawa", "Informa",  wali);
      mahasiswa.tampilkanData();
  }
}