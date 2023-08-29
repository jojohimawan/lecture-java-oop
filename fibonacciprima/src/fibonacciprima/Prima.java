/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacciprima;

/**
 *
 * @author jordan
 */
public class Prima {
    long jumlah;
    
    public void setJumlah(long n) {
        this.jumlah = n;
    }
    
    public void TampilDeret() {
        int faktor = 0;
        
        for (long i = 1; i <= jumlah; i++) {
            faktor = 0;
            
            for(long j = 1; j <= i; j++) {
                if(i % j == 0) {
                    faktor++;
                }
            }
            
            if(faktor == 2) {
                System.out.print(i + " ");
            }
        }   
    }
}
