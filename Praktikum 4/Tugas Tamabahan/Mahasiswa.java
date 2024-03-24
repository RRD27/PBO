/*Nama     :Raden Rico Dwianda
NIM        :24060122144018
Tanggal    :17 Maret 2024
Lab C1*/
/**Membuat package mahasiswa**/
package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang {
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali) {
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim() {
        return this.nim;
    }

    public String getJuruan() {
        return this.jurusan;
    }

    public WaliMahasiswa getWali() {
        return this.wali;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak() {
        super.cetak();
        System.out.println("NIM: " + this.getNim());
        System.out.println("Jurusan: " + this.getJuruan());
    }
}