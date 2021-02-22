/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz220221;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class Quiz220221 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Customers =======");
            System.out.println("1. -> customer1");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    String name1;
                    String age1;

                    System.out.println("Enter the name of the customer1 ->");

                    System.out.println("Enter the name1 and age1");
                    name1 = input.nextLine();
                    age1 = input.nextLine();
                    System.out.println("the name1 is->" + name1);
                    System.out.println("the age1 is ->" + age1);

                    break;
                    
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 3);
        
        
            
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

            
      

    
    
