/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacciprima;
import java.util.*;
/**
 *
 * @author jordan
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fibonacci fibo = new Fibonacci(0);
        Prima prim = new Prima();
     
        System.out.print("Masukkan jumlah deret Fibonacci: ");
        try {
            fibo.setN(in.nextLong());
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        System.out.print(fibo.getN() + " deret Fibonacci = ");
        
        fibo.TampilDeret();
        
        System.out.println("\n");
        
        System.out.print("Masukkan batas bilangan prima: ");
        try {
            prim.setJumlah(in.nextLong());
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        prim.TampilDeret();
        

    }
}
