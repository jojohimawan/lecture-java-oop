/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author jordan
 */
public class Katak {
    int umur;
    String nama;
    
    public Katak(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }
    
    // CONCERN: di class diagram method ini gak menrima param, blm kepikiran approach lain
    protected String caraBergerak(String gerak) {
        return gerak;
    }
    
}
