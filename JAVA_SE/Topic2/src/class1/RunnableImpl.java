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
 */
public class RunnableImpl implements Runnable {

        String name;

        public RunnableImpl(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println("Before sleep.." + name);
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(2000);
                    System.out.println("Thread running" + name + " " + i);
                }
                System.out.println("After sleep.." + name);
            } catch (InterruptedException ex) {
                Logger.getLogger(Class1a.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
