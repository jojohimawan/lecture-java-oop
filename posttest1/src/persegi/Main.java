/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persegi;

/**
 *
 * @author jordan
 */
public class Main {
    public static void main(String[] args) {
        Geometri persegi = new Geometri(500);
        
        persegi.HitungLuasPersegi();
        System.out.println("\n");
        
        persegi.HitungKelilingPersegi();
        System.out.println("\n");
        
        persegi.HitungLuasPersegiAbnormal();
        System.out.println("\n");
        
        persegi.HitungKelilingPersegiAbnormal();
        System.out.println("\n");
        
        persegi.HitugLuasSegitigaAbnormal();
        System.out.println("\n");
        
        persegi.HitungKelilingSegitigaAbnormal();
        System.out.println("\n");
        
        persegi.HitungLuasLingkaranAbnormal();
        System.out.println("\n");
        
        persegi.HitungKelilingLingkaranAbnorma();
        System.out.println("\n");
        
        persegi.HitungLuasGenjangAbnromal();
        System.out.println("\n");
        
        persegi.HitungKelilingGenjangAbnormal();
        System.out.println("\n");
    }
}
