/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author lenovo
 */
public class TestSenjata {
    public static void main(String[] args){
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata Konak47 = new KontrolSenjata(ak47);
        KontrolSenjata Konm16 = new KontrolSenjata(m16);
        
        Konak47.menembak(2);
        Konak47.isiPeluru(3);
        Konak47.menembak(5);
        
        System.out.println("=========================================");
        
        Konm16.menembak(1);
        Konm16.isiPeluru(5);
        Konm16.menembak(2);
    }
}
