/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author jordan
 */
public class MyClass {
    void myMethod(int i) {
        System.out.println("int version");
    }
    
    void myMethod(String s) {
        System.out.println("String version");
    }
    
    public static void main(String args[]){
        MyClass obj = new MyClass();
        char ch = 'c';
        obj.myMethod(ch);
    }
}


// method yg diexecute merupakan methon yang menerima parameter integer