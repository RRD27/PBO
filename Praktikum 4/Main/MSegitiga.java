/* MSegitiga.java
 * Nama: Raden Rico Dwianda
 * NIM: 24060122140184
 * Tgl: 16 Mar 2024
 * Deskripsi : Membuat main segitiga
 */
package org.main;

import org.bangundatar.*;

public class MSegitiga {
    public static void main(String[] args) {
        Segitiga t1 = new Segitiga(7, 15, 3);
        t1.printInfo();
        System.out.println("Luas Persegi Panjang : " + t1.hitungLuas());
    }

}