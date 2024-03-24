/*
 * Nama : Raden Rico Dwianda
 * NIM  : 24060122140184
 * Tgl  : 23 Maret 2023
 * Des  : Membuat Lingkaran.java
 */

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}