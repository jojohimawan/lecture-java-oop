/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author jordan
 */
public class Motor {
    String brand;
    int kapMesin;
    int tenaga;
    
    public Motor(String brand, int kapMesin, int tenaga) {
        this.brand = brand;
        this.kapMesin = kapMesin;
        this.tenaga = tenaga;
    }
    
    public void setKapMesin(int kapMesin) {
        this.kapMesin = kapMesin;
    }
    
    public int getKapMesin() {
        return this.kapMesin;
    }
}
