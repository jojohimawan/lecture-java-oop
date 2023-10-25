/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author jordan
 */
public class TesTugas2 {
    public static void main(String[] args) {
        Katak O1 = new Katak(5, "Froggy");
        Kecebong O2 = new Kecebong("Junior Frog", 2, 10);
        
        System.out.println("Objek\t\tUmur\t\tNama\t\tPanjang Ekor\t\tCara Bergerak");
        System.out.println("O1\t\t" + O1.umur + "\t\t" + O1.nama + "\t\t" + "-" + "\t\t\t" + O1.caraBergerak("Melompat"));
        System.out.println("O2\t\t" + O2.umur + "\t\t" + O2.nama + "\t" + O2.panjangEkor + "\t\t\t" + O2.caraBergerak("Berenang"));
        
        String str = new String();
        
        
    }
}
