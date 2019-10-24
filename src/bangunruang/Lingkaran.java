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
public class Lingkaran extends BangunRuang{
    
    private int r; // r = jari - jari

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    @Override
    public double hitungVolume() {
        return 4*r*r*r*PI/3 ; //To change body of generated methods, choose Tools | Templates.
    }
}
