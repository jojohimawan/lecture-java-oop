/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;


/**
 *
 * @author jordan
 */
public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;
    
    public Bank() {
        this.nasabah = new Nasabah[100];
        this.jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir) {
        this.nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        this.jumlahNasabah++;
    }
    
    public int getJumlahNasabah() {
        return this.jumlahNasabah;
    }
    
    public Nasabah getNasabah(int index) {
        return this.nasabah[index];
    }
    
}
