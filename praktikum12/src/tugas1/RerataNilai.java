/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
import java.lang.reflect.Method;
/**
 *
 * @author jordan
 */
public class RerataNilai {
    public int average(int a, int b) {
        // get parameter count
        int paramCount = new Object(){}.getClass().getEnclosingMethod().getParameterCount();
        
        return (a + b) / paramCount;
    }
    
    public double average(double a, double b) {
        // get parameter count
        double paramCount = new Object(){}.getClass().getEnclosingMethod().getParameterCount();
        
        return (a + b) / paramCount;
    }
    
    public int average(int a, int b, int c) {
        // get parameter count
        int paramCount = new Object(){}.getClass().getEnclosingMethod().getParameterCount();
        
        return (a + b + c) / paramCount;
    }
}
