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
public class Account extends Bank{

    public Account() {
        super(0);
    }

    @Override
    public void payDeposit(double rupees) {
        super.rupees += rupees;
    }

    @Override
    public void payWidraw(double rupees) {
        super.rupees -= rupees;
    }
  
    @Override
    public double totalPay(){
        return super.totalPay();
    }
    
}
