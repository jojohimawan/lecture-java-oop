/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan1;

/**
 *
 * @author jordan
 */
public class IfElseName {
    public static void main(String[] args) {
        char firstInitial = 'a';
        
        System.out.println("Masukkan huruf awal anda: ");
        try {
            firstInitial = (char)System.in.read();
        } catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }
        
        if (firstInitial == 'a')
            System.out.println("Nama anda pasti Asep!");
        else if (firstInitial == 'b')
            System.out.println("Nama anda pasti Brodin!");
        else if (firstInitial == 'c')
            System.out.println("Nama anda pasti Cecep!");
        else
            System.out.println("Nama anda tidak terkenal!");
    }
}
