/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

/**
 *
 * @author jordan
 */
public class Dosen extends Orang {
    private int nip;
    
    public Dosen(String nama) {
        super(nama);;
    }
    
    public Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }
    
    public Dosen(String nama, int nip, int umur) {
        super(nama, umur);
        this.nip = nip;
    }
    
    // CONCERN: no return type in class diagram?
    public void Info() {
        System.out.println("Nama:\t " + super.nama);
        System.out.println("Umur:\t " + super.umur);
        System.out.println("NIP:\t " + this.nip);
    }
}
