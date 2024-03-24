/*
 * Nama : Raden Rico Dwianda
 * NIM  : 24060122140184
 * Tgl  : 23 Maret 2023
 * Des  : Membuat Main Lingkaran (MLingkaran.java)
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jejari lingkaran: ");
        double r = scan.nextDouble();
        Lingkaran l = new Lingkaran(r);
        System.out.println("Luas lingkaran dengan" +
                " jejari " + r + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}