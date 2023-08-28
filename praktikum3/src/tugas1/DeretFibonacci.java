/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
import java.util.*;
/**
 *
 * @author jordan
 */
public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int n1 = 0;
        int n2 = 0;
        int next_n;
        
        System.out.println("Masukkan berapa deret Fibonacci: ");
        n = input.nextInt();
        
        System.out.print(n + " deret Fibonacci = ");
        for (int i = 0; i < 8; i++) {
            if(i == 0) n1 = 1;
            if(i == 1) n2 = 1;
            
            next_n = n1 + n2;
            n1 = n2;
            n2 = next_n;
            
            System.out.print(next_n + " ");
        }
    }
}
