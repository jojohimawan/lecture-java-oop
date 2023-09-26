/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import entity.*;
import javax.swing.UIManager;
/**
 *
 * @author jordan
 */
public class Test {
    Bisnis bisnis;
    
    public Test() {
        this.bisnis = new Bisnis();
    }
    
    public static void main(String[] args) {
         UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
            for (UIManager.LookAndFeelInfo look : looks) {
            System.out.println(look.getClassName());
            }
    }
}
