/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1c;

import java.util.Scanner;

/**
 *
 * @author openm
            * ABSTRACTION
 */
public class Class1c {
    public static void main(String[] args) {
        
        Account acc = new Account();
        
        System.out.println("Deposit 10");
        acc.payDeposit(10);
        
        System.out.println("Total Pay: " + acc.totalPay());
        
        System.out.println("Withdraw 5");
        acc.payWidraw(5);
        
        System.out.println("Total Pay: " + acc.totalPay());

    }
}
