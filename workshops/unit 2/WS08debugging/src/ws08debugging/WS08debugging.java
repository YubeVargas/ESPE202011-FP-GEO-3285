/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws08debugging;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class WS08debugging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int multiplicand = 0;
        int multiplier = 1;
        int product;
        int stop = 11;

        product = 0;
        
        do {
            System.out.println(" Enter the table want to study ");
            System.out.println(" 0 (zer0) to exit --> ");
            
            Scanner input = new Scanner(System.in);
            multiplicand = input.nextInt();

            if (multiplicand != 0) {
                System.out.println("Study the tabla of -->" + multiplicand + "<---");
                for (int i = 1; multiplier <= stop; multiplier++) {
                    product = multiplicand * multiplier;
                    System.out.println(multiplicand + " x" + multiplier + " = " + product);
                }
            }
            multiplier = 1;

        } while (multiplicand != 0);
        System.out.println("Godd bye");

    }

}