/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14farmsimilation;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class HW14Farmsimilation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] VegetablesByTray;
        String[] vegetables = {"Carrot", "Lettuce", "Celery"};
        float[] QuantityByCoop = {1F, 2F, 5F, 10F, 15F, 20F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of the number of vegetables ->");
        n = input.nextInt();
        
        VegetablesByTray = new int[n];
        // vegetables = new String [20];
        // Quantity ByCoop = new float [n];

// VegetablesPerTray [0] = 7;
// VegetablesPerTray [1] = 9;55577889
// VegetablesPerTray [2] = 3;
// VegetablesPerTray [3] = 9;
// VegetablesPerTray [4] = 8;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of vegetables in the basket" + (i + 1) + "->");
            VegetablesByTray[i] = input.nextInt();
        }

        for (int bytray : VegetablesByTray) {
            System.out.println("VegetablesByTray" + bytray);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("VegetablesByTray" + (i + 1) + "->" + VegetablesByTray[i]);
        }

        for ( String vegetable: vegetables) {
            System.out.println("name of vegetable ->" + vegetable);
        }

        for (int i = 0; i < QuantityByCoop.length; i++) {
            System.out.println("Quantity of vegetables" + (i + 1) + "->" + QuantityByCoop[i]);
        }

    }

}
