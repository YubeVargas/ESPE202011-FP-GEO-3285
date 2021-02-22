/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15.correctionexam;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class WS15CorrectionExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int totalnames = 0;
         String[] names;
         float[] agecustomers;
         
     
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the amount of customers full names");
         totalnames = scanner.nextInt();
         
         names = new String[totalnames];
         agecustomers = new float[totalnames];
         
         for (int i = 0; i <totalnames; i++){
             scanner.nextLine();
             System.out.print("Enter the name customer 1 " + 1 + "->");
             names[i] = scanner.nextLine();
             System.out.print("Enter age" + names[i] + "age customer ->");
             agecustomers[i] = scanner.nextFloat();
             
         }
         
         System.out.println("name -> age");
         
         for(int i= 0; 1 < totalnames; i++){
             System.out.println(names[i] + " -> " + agecustomers[i]);
         }
         
         
        }

    }
    
    

