/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author jordan
 */
public class Truk {
    double muatan, muatanmaks;
    
    public Truk(double beratmaks) {
        muatanmaks = beratmaks;
    }
    
    public double getMuatan() {
        return muatan;
    }
    
    public double getMuatanMaks() {
        return muatanmaks;
    }
    
    public void tambahMuatan(double i) {
        if(muatan+i < muatanmaks) {
            muatan += i;
        } else {
            return;
        }
        
    }
    
}
