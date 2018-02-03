/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1d;

/**
 *
 * @author openm
                * Polymorphism
 */
public class Class1d {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        
        System.out.println(cal.add(2, 3));
        
        System.out.println(cal.add(2, 3, 5));
    }
}
