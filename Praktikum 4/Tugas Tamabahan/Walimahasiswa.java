/*Nama     :Abisatya Hastarangga Pradana
NIM        :24060122120004
Tanggal    :17 Maret 2024
Lab C1*/
/**Membuat package walimahasiswa**/
package org.walimahasiswa;

import org.orang.Orang;

public class WaliMahasiswa extends Orang {
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat) {
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp() {
        return this.nomorHp;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetak() {
        super.cetak();
        System.out.println("Nomor Hp: " + this.getNomorHp());
        System.out.println("Alamat: " + this.getAlamat());
    }
}