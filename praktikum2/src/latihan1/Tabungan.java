/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author jordan
 */
public class Tabungan {
    int saldo, mutasi;
    
    public Tabungan(int i) {
        saldo = i;
    }
    
    public void ambilUang(int i) {
        mutasi = i;
        saldo = saldo - i;
    }
    
}
