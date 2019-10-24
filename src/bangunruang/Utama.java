/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author 'KoalaX'
 * Nama     : Fiqri Akbar Pratama
 * Nim      : 10118020
 * Kelas    : IF-1 
 * Deskripsi Program : Program ini berisi program untuk menghitung volume dari 
 * beberapa macam bangun ruang (Lingkaran Bola , Tabung , Kerucut)
 */
public class Utama  {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lingkaran lingkaran = new Lingkaran();
        
        lingkaran.setR(7);
        
        System.out.println("Luas Lingkaran");
        System.out.println("Jari - Jari Bola = "+lingkaran.getR()+" cm");
        System.out.println("V = "+Math.ceil(lingkaran.hitungVolume())+" cm3");
        System.out.println("");
        
        //========================================================
        
        Tabung tabung = new Tabung();
        
        tabung.setR(10);
        tabung.setTinggi(21);
        
        System.out.println("Luas Tabung");
        System.out.println("Jari - Jari Tabung = "+tabung.getR()+" cm");
        System.out.println("Tinggi Tabung = "+tabung.getTinggi()+" cm");
        System.out.println("V = "+Math.ceil(tabung.hitungVolume())+" cm3");
        System.out.println("");
        
        //========================================================
        
        Kerucut kerucut = new Kerucut();
        
        kerucut.setR(14);
        kerucut.setTinggi(9);
        
        System.out.println("Luas Kerucut");
        System.out.println("Jari - Jari Kerucut = "+kerucut.getR()+" cm");
        System.out.println("Tinggi Kerucut = "+kerucut.getTinggi()+" cm");
        System.out.println("V = "+Math.ceil(kerucut.hitungVolume())+" cm3");
        
        //========================================================
        
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }   
    
    
}
