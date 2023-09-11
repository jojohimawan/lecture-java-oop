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
    ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>(); 
    private int jumlahNasabah;
    
    public Bank() {
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
    
    // HOTFIX : add method to delete nasabah
    public void hapusNasabah(int index) {
        this.nasabah.remove(index);
    }
    
    // HOTFIX : add method to edit nasbah
    public void editNasabah(int index, String namaAwal, String namaAkhir) {
        this.nasabah.get(index).setNamaAwal(namaAwal);
        this.nasabah.get(index).setNamaAkhir(namaAkhir);
    }
    
}
