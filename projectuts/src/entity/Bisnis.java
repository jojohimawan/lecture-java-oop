/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.ArrayList;
/**
 *
 * @author jordan
 */
public class Bisnis {
    private ArrayList<Produk> produk;
    private int jumlahProduk;
    
    public Bisnis() {
        this.produk = new ArrayList<>();
        this.jumlahProduk = 0;
    }
    
    public boolean tambahProduk(String nama, double harga, int stok) {
        if(this.produk.size() == 9) return false;
        
        this.produk.add(new Produk(nama, harga, stok, this.jumlahProduk));
        this.jumlahProduk++;
        return true;
    }
    
    public void editProduk(String nama, double harga, int stok, int index) {
        this.produk.get(index).setNama(nama);
        this.produk.get(index).setHarga(harga);
        this.produk.get(index).setStok(stok);
    }
    
    public boolean hapusProduk(int id) {
        if(this.produk.size() <= 0 || this.produk.size() < id) return false;
        
        this.produk.remove(id);
        return true;
    }
    
    public Produk getProduk(int index) {
        return this.produk.get(index);
    }
    
    public int getProdukTotal() {
        return this.produk.size();
    }
}
