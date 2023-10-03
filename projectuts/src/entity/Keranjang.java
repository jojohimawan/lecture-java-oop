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
public class Keranjang {
    private ArrayList<ItemKeranjang> item;
    
    public Keranjang() {
        this.item = new ArrayList<>();
    }
    
    public void tambahItem(Produk produk, int qty, double subtotal) {
       this.item.add(new ItemKeranjang(produk, qty, subtotal));
    }
    
    public ItemKeranjang getItemKeranjang(int index) {
        return this.item.get(index);
    }
    
    public int getItemKeranjangSize() {
        return this.item.size();
    }
}
