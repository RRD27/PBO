/* PersegiPanjang.java
 * Nama: Raden Rico Dwianda
 * NIM: 24060122140184
 * Tgl: 16 Mar 2024
 * Deskripsi : Membuat package bangun datar, persegi panjang
 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printInfo() {
        System.out.println("Bangun Persegi Panjang berisi " + this.getJumlahSisi());
    }
}