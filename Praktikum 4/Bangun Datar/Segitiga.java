/* Segitiga.java
 * Nama: Raden Rico Dwianda
 * NIM: 24060122140184
 * Tgl: 16 Mar 2024
 * Deskripsi : Membuat package bangun datar, segitiga
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return alas * tinggi * (0.5);
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga berisi " + this.getJumlahSisi());
    }
}