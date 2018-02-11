/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author openm
        * SIMPLE in line Thread
 */
public class Class1b {

    public static void main(String[] args) {

        System.out.println("Thread start");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Class1b.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < 1000; i++) {
            System.out.println("Threading " + i);
        }

        System.out.println("Thread end");

    }
}
