/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacciprima;

/**
 *
 * @author jordan
 */
public class Fibonacci {
    long n;
    long n_1;
    long n_2;
    long next_n;
    
    public Fibonacci(long init) {
        this.n = init;
        this.n_1 = init;
        this.n_2 = init;
        this.next_n = init;
    }
    
    public void setN(long n) {
        this.n = n;
    }
    
    public long getN() {
        return this.n;
    }
    
    public void TampilDeret() {
        for (long i = 0; i < this.n; i++) {
            if(i == 0) this.n_1 = 1;
            if(i == 1) this.n_2 = 1;
            
            this.next_n = n_1 + n_2;
            this.n_1 = this.n_2;
            this.n_2 = this.next_n;
            
            System.out.print(this.next_n + " ");
        }
    }
}
