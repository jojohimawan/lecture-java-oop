/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author jordan
 */
public class ClassEmpat {
    int jumlah;
    
    public ClassEmpat(int jumlah) {
        this.jumlah = jumlah;
    }
    
    // nomor 4
    public void HitungLuasPersegi() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas persegi ke-" + (i + 1) + " = " + (i+1)*(i+1) + " cm2");
        }
    }
    
    public void HitungKelilingPersegi() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling persegi ke-" + (i + 1) + " = " + (i+1)*4 + " cm");
        }
    }
    
    public void HitugLuasSegitiga() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas segitiga  ke-" + (i + 1) + " = " + (((i+1)*(i+1))/2) + " cm2");
        }
    }
    
    public void HitungKelilingSegitiga() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling segitiga  ke-" + (i + 1) + " = " + ((i+1)*3) + " cm");
        }
    }
    
    public void HitungLuasLingkaran() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas lingkaran  ke-" + (i + 1) + " = " + (3.14 * ((i+1)*(i+1))) + " cm2");
        }
    }
    
    public void HitungKelilingLingkaran() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling lingkaran  ke-" + (i + 1) + " = " + (3.14 + ((i+1)*2)) + " cm");
        }
    }
    
    public void HitungLuasGenjang() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas Genjang  ke-" + (i + 1) + " = " + (((i+1)*2)) + " cm2");
        }
    }
    
    public void HitungKelilingGenjang() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Keliling Genjang  ke-" + (i + 1) + " = " + ((i+1) * 4) + " cm");
        }
    }
    
    public void HitungLuasKubus() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas Kubus ke-" + (i + 1) + " = " + ((i+1)*(i+1) * 6) + " cm2");
        }
    }
    
    public void HitungVolumeKubus() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("volume Kubus ke-" + (i + 1) + " = " + ( ((i+1) * (i+1)) * (i+1) ) + " cm2");
        }
    }
    
    public void HitungLuasBalok() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas balok ke-" + (i + 1) + " = " + ( 10 * ((i+1)*(i+1)) ) + " cm2");
        }
    }
    
    public void HitungVolumeBalok() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Volume balok ke-" + (i + 1) + " = " + ( (((i+1) * 2)*(i+1)) * (i+1) ) + " cm2");
        }
    }
    
    // nomor 5
    public void HitungLuasKubusAbnormal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas kubus abnormal ke-" + (i + 1) + " = " + (6 * ( (i+1) * 2) ) + " cm2");
        }
    }
    
    public void HitungLuasBalokAbnormal() {
        for (int i = 0; i < this.jumlah; i++) {
            System.out.println("Luas balok abnormal ke-" + (i + 1) + " = " + (10 * ( (i+1) * 2) ) + " cm2");
        }
    }
}
