/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1c;

/**
 *
 * @author openm
 */
public abstract class Bank {    

    double rupees = 0;
    
    public Bank(double rupees) {
        this.rupees = rupees;
    }
    
    public abstract void payDeposit(double rupees);
    
    public abstract void payWidraw(double rupees);
    
    public double totalPay(){
        return rupees;
    }
    
}
