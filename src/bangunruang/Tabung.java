/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import static java.lang.Math.PI;

/**
 *
 * @author 'KoalaX'
 * Nama     : Fiqri Akbar Pratama
 * Nim      : 10118020
 * Kelas    : IF-1 
 * Deskripsi Program : Program ini berisi program untuk menghitung volume dari 
 * beberapa macam bangun ruang (Lingkaran Bola , Tabung , Kerucut)
 */
public class Tabung extends BangunRuang {

    private int r; // r = jari-jari
    private int tinggi;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
     return PI*(r*r)*tinggi; //To change body of generated methods, choose Tools | Templates.
    }
    
}
