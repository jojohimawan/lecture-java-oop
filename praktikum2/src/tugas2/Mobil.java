/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author jordan
 */
public class Mobil {
    String brand;
    String warna;
    String tipe;
    String kursi;
    int harga;
    
//    public Mobil(String brand, String warna, String tipe, String kursi, int harga) {
//        this.brand = brand;
//        this.warna = warna;
//        this.tipe = tipe;
//        this.kursi = kursi;
//        this.harga = harga;
//    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void setKursi(String kursi) {
        this.kursi = kursi;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getWarna() {
        return warna;
    }

    public String getTipe() {
        return tipe;
    }

    public String getKursi() {
        return kursi;
    }

    public int getHarga() {
        return harga;
    }
    
    
}
