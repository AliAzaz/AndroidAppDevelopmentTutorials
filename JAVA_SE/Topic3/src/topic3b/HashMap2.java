/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic3b;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author openm
 * Use of Hashmap with arraylist
 */
public class HashMap2 {

    public static void main(String[] args) {

        Scanner abc = new Scanner(System.in);
        System.out.println("Many many Employees:");
        int no = abc.nextInt();

        Map<String, String> map = new HashMap();
        List<String> empNames = new java.util.ArrayList<>();

        for (int i = 0; i < no; i++) {

            System.out.println("Enter name:");
            String name = abc.next();

            System.out.println("Enter contact:");
            String contact = abc.next();

            map.put(name.toLowerCase(), contact);
            empNames.add(name.toLowerCase());
        }

        System.out.println("\nEmployees are:");

        for (int i = 0; i < empNames.size(); i++) {
            System.out.println(empNames.get(i).toUpperCase());
        }

        System.out.println("\nEnter name to get their contact no:");
        String input = abc.next();

        System.out.println("Contact mo is:" + map.get(input).toUpperCase());

    }
}
