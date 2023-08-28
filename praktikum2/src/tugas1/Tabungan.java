/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author jordan
 */
public class Tabungan {
    int saldo;
    
    public Tabungan(int i) {
        saldo = i;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah) {
        if(saldo < jumlah) {
            return false;
        } else {
            saldo -= jumlah;    
            return true;
        }
        
    }
 }
