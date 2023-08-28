/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;
import java.util.*;
/**
 *
 * @author jordan
 */
public class DeretGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for(int i = 2; i <= 20; i+=2) {
            if(i % 6 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
