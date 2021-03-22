/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22modularcalculator;

import java.util.Scanner;
import util.BasicOperation;

/**
 *
 * @author David V
 */
public class WS22ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        float number1;
        float number2;
        float result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Enter 2 Numbers ");
        number1 = input.nextFloat();
        number2 = input.nextFloat();
        
        System.out.println(" --- Multiplication --- ");
        result = BasicOperation.multiplicateNumbers(number1, number2);
        System.out.println( number1 + " * " + number2 + " = " + result);
        
        System.out.println(" --- Division --- ");
        result = BasicOperation.divideNumbers(number1, number2);
        System.out.println( number1 + " / " + number2 + " = " + result);
    }
    
}
        


