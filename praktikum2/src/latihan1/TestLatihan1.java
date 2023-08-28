/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

import latihan1.Tabungan;

/**
 *
 * @author jordan
 */
public class TestLatihan1 {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(5000);
        
        System.out.println("Saldo awal = " + tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil = 2300");
        System.out.println("Saldo sekarang = " + tabungan.saldo);
    }
}
