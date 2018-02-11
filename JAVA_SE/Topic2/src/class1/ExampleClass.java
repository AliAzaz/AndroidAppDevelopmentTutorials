/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

/**
 *
 * @author openm
 */
public class ExampleClass {
   
    static int abc = 0;
    int kbc = 0;

    public ExampleClass() {
        System.out.println("Static " + ExampleClass.abc);
        System.out.println("Non-Static " + kbc);
    }
   
    public void print(){
        ExampleClass.abc = 1;
        kbc = 2;
        
        System.out.println("Static " + ExampleClass.abc);
        System.out.println("Non-Static " + kbc);
    }
}
