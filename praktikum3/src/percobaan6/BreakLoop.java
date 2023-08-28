/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan6;

/**
 *
 * @author jordan
 */
public class BreakLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Iterasi ke " + i);
            i++;
            if (i > 10) break;
        } while (true);
    }
}
