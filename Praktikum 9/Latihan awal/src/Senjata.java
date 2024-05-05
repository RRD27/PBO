/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */

/*
Nama        : David Nugroho
NIM         : 24060122130074
File        : Senjata.java
Deskripsi   : Representasi dasar dari objek Senjata
*/

package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public void menembak(){
        System.out.println(this.getBunyi());
        this.peluru -= 1;
        System.out.println("Sisa Peluru: " + this.getPeluru());
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}