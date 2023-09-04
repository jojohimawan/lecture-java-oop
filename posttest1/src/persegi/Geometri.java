/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persegi;

/**
 *
 * @author jordan
 */
public class Geometri {
    int jumlah;
    
    public Geometri(int jumlah) {
        this.jumlah = jumlah;
    }
    
    // nomor 1
    public void HitungLuasPersegi() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas persegi ke-" + (i + 1) + " = " + (i+1)*(i+1) + " cm2");
        }
    }
    
    // nomor 2
    public void HitungKelilingPersegi() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling persegi ke-" + (i + 1) + " = " + (i+1)*4 + " cm");
        }
    }
    
    // nomor 3
    public void HitungLuasPersegiAbnormal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas persegi abnormal ke-" + (i + 1) + " = " + ((i+1)*2) + " cm2");
        }
    }
    
    public void HitungKelilingPersegiAbnormal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling persegi abnormal ke-" + (i + 1) + " = " + ((i+1)+4) + " cm");
        }
    }
    
    public void HitugLuasSegitigaAbnormal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas segitiga abnormal ke-" + (i + 1) + " = " + (((i+1)*(i+1))/2) + " cm2");
        }
    }
    
    public void HitungKelilingSegitigaAbnormal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling segitiga abnormal ke-" + (i + 1) + " = " + ((i+1)*3) + " cm");
        }
    }
    
    public void HitungLuasLingkaranAbnormal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas lingkaran abnormal ke-" + (i + 1) + " = " + (3.14 * (i+1)) + " cm2");
        }
    }
    
    public void HitungKelilingLingkaranAbnorma() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling lingkaran abnormal ke-" + (i + 1) + " = " + (3.14 + (i+1)) + " cm");
        }
    }
    
    public void HitungLuasGenjangAbnromal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas Genjang abnormal ke-" + (i + 1) + " = " + (((i+1)*2) / 2) + " cm2");
        }
    }
    
    public void HitungKelilingGenjangAbnormal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling Genjang abnormal ke-" + (i + 1) + " = " + ((i+1) * (i+1)) + " cm");
        }
    }
}
