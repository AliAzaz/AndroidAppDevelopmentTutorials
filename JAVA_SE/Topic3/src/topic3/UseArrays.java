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
public class UseArrays {

    /**
     * @param args the command line arguments
            * Array (Multidimensional)
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] hotel = new int[5][3];

        System.out.println("Total Floor 5");
        System.out.println("Each Floor having 3 rooms with respective names");

//        Example 1
         /*for (int i = 0; i < hotel.length; i++) {
                for (int j = 0; j < hotel[i].length; j++) {
                    hotel[i][j] = j + 1;
                }
        }*/
        
//        Example 2
        for (int[] hotel1 : hotel) {
            for (int j = 0; j < hotel1.length; j++) {
                hotel1[j] = j + 1;
            }
        }

        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.println("Floor " + (i + 1) + " Room name Floor" + (i + 1) + "_" + hotel[i][j]);
            }
            System.out.println("");
        }

    }

}
