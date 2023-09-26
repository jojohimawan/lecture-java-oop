/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author jordan
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public String getNamaAwal() {
        return this.namaAwal;
    }
    
    public String getNamaAkhir() {
        return this.namaAkhir;
    }
    
    public Tabungan getTabungan() {
        return tabungan;
    }
   
    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan; // ASOSIASI
    }
    
    // HOTFIX : add setter namaAwal
    public void setNamaAwal(String namaAwal) {
        this.namaAwal = namaAwal;
    }
    
    // HOTFIX : add setter namaAkhir
    public void setNamaAkhir(String namaAkhir) {
        this.namaAkhir = namaAkhir;
    }
    
    
}
