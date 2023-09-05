/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author jordan
 */
public class Shape {
    double length;
    double width;
    double height;
    double volume;
    
    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double compareTo(Shape shape) {
        double selisih = (shape.volume > this.volume) ? shape.volume - this.volume : this.volume - shape.volume;
        
        return selisih;
    }
    
    private void calculateVolume() {
        this.volume = (this.length * this.width) * this.height;
    }
    
    public void cetak() {
        calculateVolume();
        
        System.out.println("Panjang x Lebar x Tinggi = " + this.length + " " + this.width + " " + this.height);
        System.out.println("Volume = " + this.volume);
    }
}
