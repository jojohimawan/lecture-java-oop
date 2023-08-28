/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;
import java.util.*;
/**
 *
 * @author jordan
 */
public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;
        
        System.out.println("Masukkan tahun (1900-2005): ");
        tahun = input.nextInt();
        
        if(tahun < 1900) {
            System.out.println("Maaf, tahun input dibawah 1900");
        } else if(tahun > 2005) {
            System.out.println("Maaf, tahun input diatas 2005");
        } else {
            if(tahun % 4 == 0 || tahun % 400 == 0) {
                System.out.println(tahun + " Adalah tahun kabisat");
            } else {
                System.out.println(tahun + " Bukan tahun kabisat");
            }
        }
    }
}
