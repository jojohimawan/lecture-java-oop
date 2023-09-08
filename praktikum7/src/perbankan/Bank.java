/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;
import java.util.ArrayList;

/**
 *
 * @author jordan
 */
public class Bank {
//    private Nasabah[] nasabah;
    ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
    private int jumlahNasabah;
    
    public Bank() {
//        this.nasabah = new Nasabah();
        this.jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir) {
//        this.nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        this.nasabah.add(new Nasabah(namaAwal, namaAkhir));
        this.jumlahNasabah++;
    }
    
    public int getJumlahNasabah() {
        return this.jumlahNasabah;
    }
    
    public Nasabah getNasabah(int index) {
        return this.nasabah.get(index);
    }
    
}
