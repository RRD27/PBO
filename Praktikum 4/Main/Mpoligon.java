/* MPoligon.java
 * Nama: Raden Rico Dwianda
 * NIM: 2406012214018
 * Tgl: 16 Mar 2024
 * Deskripsi : Membuat main poligon
 */
package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(20, 20, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
    }

}