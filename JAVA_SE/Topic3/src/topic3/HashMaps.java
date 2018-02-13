/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author openm Hash Map
 */
public class HashMaps {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ali");
        map.put(2, "Kashif");
        map.put(3, "Inam");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 or 2 or 3 to get specific name in its regards.");
        String choice = scan.next();

        try {
            System.out.println("Name: " + map.get(Integer.valueOf(choice)));
        } catch (NumberFormatException e) {
            System.out.println("Sorry wrong choice");
        }
    }
}
