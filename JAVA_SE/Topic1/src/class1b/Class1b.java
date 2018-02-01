/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1b;

/**
 *
 * @author openm
            * INHERITANCE
 */
public class Class1b {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        System.out.println(v.speed(20, 10));
        
        car c = new car();
        System.out.println(c.speed(20, 10));
        
        vehicle v1 = new car();
        System.out.println(v1.speed(20, 10));
        
        /* ERROR
        car c1 = new vehicle();
        System.out.println(c.speed(20, 10));
        */
    }
}
