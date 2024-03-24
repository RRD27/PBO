/*Nama     :Raden Rico Dwianda
NIM        :24060122140184
Tanggal    :17 Maret 2024
Lab C1*/
/**Membuat package main**/
package org.main;

import org.walimahasiswa.*;
import org.mahasiswa.*;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Riko", "021-454-572", "087-737-911", "St. Tembalang No. 4");
        Mahasiswa mhs1 = new Mahasiswa("Anita Max Winn", "121-321-989", "2406-0125", "Informatics", wali1);
        System.out.println("=====Data 1=====");
        wali1.cetak();
        mhs1.cetak();
        System.out.println("=====Ubah Data 1=====");
        wali1.setAlamat("St. Mulawarman No 123");
        mhs1.setJurusan("Biotekno");
        wali1.cetak();
        mhs1.cetak();
    }
}