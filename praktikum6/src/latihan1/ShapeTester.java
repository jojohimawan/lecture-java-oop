/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author jordan
 */
public class ShapeTester {
    public static void main(String[] args) {
        Shape kubus = new Shape(5, 5, 5);
        Shape balok =  new Shape(10, 5, 5);
        
        kubus.cetak();
        balok.cetak();
        
        double selisihVolume = kubus.compareTo(balok);
        System.out.println("Selisih volume = " + selisihVolume);
    }
}
