package org.mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

//Nama: Rico Dwianda
//NIM : 24060122140184
//LAB : C1

public class Mahasiswa {
  private String nama ;
  private String nik ;
  private String nim;
  private String jurusan;
  private WaliMahasiswa wali;
  
  
  

  public  Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali) {

    this.nim = nim;
    this.jurusan = jurusan;
    
    this.nama = nama;
    this.nik = nik;
    this.wali = wali;
  }

 
  public void setNama(String nama){
    this.nama = nama;
  }

  public void setNik(String nik){
    this.nik = nik;
  }
  
  public void setNim(String nim) {
    this.nim = nim;
  }

  public void setJurusan(String jurusan){
    this.jurusan = jurusan;
  }

  public void setWali(WaliMahasiswa wali){
    this.wali = wali;
  }

  public String getNama(){
    return nama;
  }
  
  public String getNik(){
    return nik;
  }


  public String getNim() {
    return nim;
  }

  public String getJurusan() {
    return jurusan;
  }

  public WaliMahasiswa getWali() {
    return this.wali;
  }

  public void tampilkanData(){
    System.out.println("Nama: " + nama);
    System.out.println("NIK: " + nik);
    System.out.println("NIM: " + nim);
    System.out.println("Jurusan: " + jurusan);
    System.out.println("=== Wali === ");
    wali.getInfo();
    
  }
  
}