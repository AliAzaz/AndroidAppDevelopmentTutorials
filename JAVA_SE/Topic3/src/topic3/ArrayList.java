/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic3;

/**
 *
 * @author openm
 */
public class ArrayList {
    public static void main(String[] args) {
        
        java.util.ArrayList arr = new java.util.ArrayList();
        arr.add("Ali");
        arr.add(5);
        arr.add('A');
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        
        java.util.ArrayList<String> abc = new java.util.ArrayList<>();
        abc.add("Ali");
        abc.add("Kashif");
        abc.add("Hussain");
      
        System.out.println("String Arraylist");
        for (int i = 0; i < abc.size(); i++) {
            System.out.println(abc.get(i));
        }
        
        System.out.println("After Delete");
        
        abc.remove(1); //Delete
        for (int i = 0; i < abc.size(); i++) {
            System.out.println(abc.get(i));
        }
    }
}
