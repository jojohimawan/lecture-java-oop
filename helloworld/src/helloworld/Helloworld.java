/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;
import java.util.*;
        
/**
 *
 * @author jordan
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    
    static void convertBiner(int x) {
        String remainder = "";
        int[] sisa = new int[100];
        int decimal = x;
        
        if(decimal <= 0) {
            System.out.println("Angka harus integer positif");
        } else {
            while(decimal > 0) {
                remainder = (decimal % 2) + remainder;
                decimal = decimal / 2;
            }
        }
        
        System.out.println("Konversi biner = " + remainder);
    }
    
    static void convertHexa(int x) {
        int[] remainder = new int[100];
        int decimal = x, i = 0;
        
        if(decimal <= 0) {
            System.out.println("Angka harus integer positif");
        } else {
            
            while(decimal != 0) {
                remainder[i] = decimal % 16;
                decimal = decimal / 16;
                i++;
            }
        }
        
        System.out.print("Konversi hexa = ");
        
        for(int j = i-1; j >= 0; j--) {
            if(remainder[j] > 9) {
                System.out.print((char)(55 + remainder[j]));
            } else {
                System.out.print(remainder[j]);
            }
        }
        
        System.out.print("\n");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello, world!");
        
        System.out.println("Masukkan integer positif: ");
        int angka = input.nextInt();
        
        convertBiner(angka);
        convertHexa(angka);
        
    }
    
}
