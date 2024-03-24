/*
 * Nama : Raden Rico Dwianda
 * NIM  : 24060122140184
 * Tgl  : 23 Maret 2024
 * Des  : Membuat Main Bujur Sangkar (MBujurSangkar.java)
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi +
                " satuan adalah " + bs.hitungLuas(sisi));

        scan.close();
    }
}