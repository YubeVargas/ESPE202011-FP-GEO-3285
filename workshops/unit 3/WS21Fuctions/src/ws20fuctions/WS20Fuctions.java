/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws20fuctions;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class WS20Fuctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float kilometers= 12;
        float fuel= 1;
        float kmroute;
        float spentfluel;
        System.out.println("AUTHOR: YUBELLY ANAHI VARGAS CORDERO");
        
        System.out.println("Insert kilometers traveled");
        kmroute= input.nextFloat();
        
        spentfluel = calculateSpentFluel(kmroute, fuel, kilometers);
        System.out.println("Total spent fluel is " + spentfluel);
        
        float extra = (float) 2.39;
        int gallon = 1;
        float numberofgallons;
        float cash;
        
        System.out.println("Insert number of gallons");
        numberofgallons = input.nextFloat();
        
        cash = calculateCash(numberofgallons, extra, gallon);
        System.out.println("The total cash to pay is" + cash);
        
    }

    private static float calculateSpentFluel(float kmroute, float fuel, float kilometers) {
        float spentfluel;
        spentfluel = (kmroute*fuel)/kilometers;
        return spentfluel;
    }

    private static float calculateCash(float numberofgallons, float extra, int gallon) {
        float cash;
        cash = (numberofgallons*extra)/gallon;
        return cash;
    }
    
}
