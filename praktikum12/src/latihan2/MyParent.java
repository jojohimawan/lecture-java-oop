/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author jordan
 */
public class MyParent {
    int x, y;
    MyParent(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int addMe(int x, int y){
        return this.x + x + y + this.y;
    }
    
    public int addMe(MyParent myPar){
        return addMe(myPar.x, myPar.y);
    }
}
