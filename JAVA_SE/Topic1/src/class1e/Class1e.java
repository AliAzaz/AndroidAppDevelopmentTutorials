/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1e;

/**
 *
 * @author openm
            * Encapsulation
 */
public class Class1e {
    public static void main(String[] args) {
        
        vehicle vh = new vehicle();
        
//        Assigning values directly to variables
        vh.min = 5.3f; // 'f' for casting no to float otherwise need to change data type of variable to double
        vh.setMax(6);
        
        System.out.println("Min val:" + vh.min);
        System.out.println("Max val:" + vh.getMax());
        System.out.println("Speed:" + vh.getSpeed());
        
//        Passing values directly to constructor
        vh = new vehicle(6, 3.5f);
        System.out.println("Min val:" + vh.min);
        System.out.println("Max val:" + vh.getMax());
        System.out.println("Speed:" + vh.getSpeed());
        
    }
}
