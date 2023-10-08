/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author jordan
 */
public class Transaksi {
    private Member member;
    
    private double total;
    private double subtotal;
    private double cash;
    private double change;
    private double ppn;
    private double nominalPpn;
    
    public Transaksi(double subtotal, double nominalPpn, double total, double cash, double change, double ppn) {
        
        this.subtotal = subtotal;
        this.nominalPpn = nominalPpn;
        this.total = total;
        this.cash = cash;
        this.change = change;
        this.ppn = ppn;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getPpn() {
        return ppn;
    }

    public void setPpn(double ppn) {
        this.ppn = ppn;
    }

    public double getNominalPpn() {
        return nominalPpn;
    }

    public void setNominalPpn(double nominalPpn) {
        this.nominalPpn = nominalPpn;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
    
    
    
    
}
