/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author jordan
 */
public class TestMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();
        Mobil mobil3 = new Mobil();
        Mobil mobil4 = new Mobil();
        
        mobil1.setBrand("Toyota");
        mobil1.setWarna("Biru");
        mobil1.setTipe("Minibus");
        mobil1.setHarga(2000);
        mobil1.setKursi("7");
        System.out.println("Mobil 1");
        System.out.println("Brand mobil1: " + mobil1.getBrand());
        System.out.println("Warna mobil1: " + mobil1.getWarna());
        System.out.println("Tipe mobil1: " + mobil1.getTipe());
        System.out.println("Harga mobil1: " + mobil1.getHarga());
        System.out.println("Kursi mobil1: " + mobil1.getKursi() + "\n\n");
        
        
        mobil2.setBrand("Daihatsu");
        mobil2.setWarna("Hitam");
        mobil2.setTipe("Pick Up");
        mobil2.setHarga(1500);
        mobil2.setKursi("2");
        System.out.println("Mobil 2");
        System.out.println("Brand mobil2: " + mobil2.getBrand());
        System.out.println("Warna mobil2: " + mobil2.getWarna());
        System.out.println("Tipe mobil2: " + mobil2.getTipe());
        System.out.println("Harga mobil2: " + mobil2.getHarga());
        System.out.println("Kursi mobil2: " + mobil2.getKursi() + "\n\n");
        
        
        mobil3.setBrand("Suzuki");
        mobil3.setWarna("Silver");
        mobil3.setTipe("SUV");
        mobil3.setHarga(1800);
        mobil3.setKursi("5");
        System.out.println("Mobil 3");
        System.out.println("Brand mobil3: " + mobil3.getBrand());
        System.out.println("Warna mobil3: " + mobil3.getWarna());
        System.out.println("Tipe mobil3: " + mobil3.getTipe());
        System.out.println("Harga mobil3: " + mobil3.getHarga());
        System.out.println("Kursi mobil3: " + mobil3.getKursi() + "\n\n");
        
        
        mobil4.setBrand("Honda");
        mobil4.setWarna("Merah");
        mobil4.setTipe("Sedan");
        mobil4.setHarga(1300);
        mobil4.setKursi("5");
        System.out.println("Mobil 4");
        System.out.println("Brand mobil4: " + mobil4.getBrand());
        System.out.println("Warna mobil4: " + mobil4.getWarna());
        System.out.println("Tipe mobil4: " + mobil4.getTipe());
        System.out.println("Harga mobil4: " + mobil4.getHarga());
        System.out.println("Kursi mobil4: " + mobil4.getKursi() + "\n\n");
    }
}
