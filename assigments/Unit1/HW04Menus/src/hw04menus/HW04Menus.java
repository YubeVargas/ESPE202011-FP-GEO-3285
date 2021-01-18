/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> cash");
            System.out.println("2. -> radio");
            System.out.println("3. -> diam");
            System.out.println("4. -> residue");
            System.out.println("6. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int n;
                    int cost;
                    int cash;
                    System.out.println("The  cash is");
                    System.out.println("enter n -> ");
                    n = input.nextInt();
                    System.out.println("enter cost -> ");
                    cost = input.nextInt();
                    cash = n * cost;
                    System.out.println(" the cash is --> " + cash);
                    break;
                    
                case 2:
                    float diameter;
                    float x; 
                    float radio;
                    System.out.println("The  radio is");
                    System.out.println("enter diameter -> ");
                    diameter = input.nextInt();
                    System.out.println("enter x-> ");
                    x = input.nextInt();
                    radio = (float) diameter / x;
                    System.out.println(" the radio --> " + radio);
                    break;
                    
                case 3:
                    short rad;
                    short rad1;
                    short diam;
                    
                    rad1 = 2; 
                    System.out.println("The diam is");
                    System.out.println("enter rad -> ");
                    rad = (short) input.nextInt();
                    diam = (short) ((short) rad1 * rad);
                    System.out.println(" diam --> " + diam);
                    break;
                    
                case 4:
                    int residue;
                    int capital;
       
                    System.out.println("The residue is");
                    System.out.println("enter cash -> ");
                    cash = input.nextInt();
                    System.out.println("enter capital -> ");
                    capital = input.nextInt();
                    residue = capital - cash;
                    System.out.println(" residue --> " + residue);
                    break;
    
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

    }
    

