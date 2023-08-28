/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;
import java.util.*;

/**
 *
 * @author jordan
 */
public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int fakt = 1;
        
        System.out.println("Masukkan bilangan faktorial: ");
        n = input.nextInt();
        
        System.out.println("n           n!");
        System.out.println("------------------");
        
        for (int i = 1; i <= n; i++) {
            fakt *= i;
            System.out.println(i + "            " + fakt);
        }
        
    }
}
