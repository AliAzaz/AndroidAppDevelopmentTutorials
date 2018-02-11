/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

/**
 *
 * @author openm
        * Multi-tasking using Threading
 */
public class Class1c {
    public static void main(String[] args) {
        System.out.println("Before thread");
        Thread th1 = new Thread(new RunnableImpl("Thread-1"));
        th1.start();

        Thread th2 = new Thread(new RunnableImpl("Thread-2"));
        th2.start();

        Thread th3 = new Thread(new RunnableImpl("Thread-3"));
        th3.start();
        System.out.println("After thread");
    }
}
