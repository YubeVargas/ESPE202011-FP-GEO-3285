/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class WS13Task {

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
            System.out.println("1. -> trapezoid area");
            System.out.println("2. -> triangle area");
            System.out.println("3. -> circle");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:

                    double Base;
                    double base;
                    double height;
                    double Area;

                    System.out.println("Insert Base -->");
                    Base = input.nextInt();

                    System.out.println("Insert base -->");
                    base = input.nextInt();

                    System.out.println("Insert height -->");
                    height = input.nextInt();

                    Area = ((Base + base) * height) / 2;
                    System.out.println(" Area is -> " + Area);

                    break;

                case 2:

                    double baset;
                    double heightt;
                    double Areat;

                    System.out.println("Insert baset -->");
                    baset = input.nextInt();

                    System.out.println("Insert heightt -->");
                    heightt = input.nextInt();

                    Areat = (baset * heightt) / 2;
                    System.out.println(" Areat is -> " + Areat);
                    break;

                case 3:

                    double radio;
                    double pi = 3.14;
                    double AreaC;

                    System.out.println("Insert radio -->");
                    radio = input.nextInt();

                    AreaC = ((radio * radio) * pi);
                    System.out.println(" AreaC is -> " + AreaC);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 3);
        

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> aceleration");
            System.out.println("2. -> MovementUniform");
            System.out.println("3. -> time");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {  
                
            case 1:

                    double Vf;
                    double Vi;
                    double t;
                    double aceleration;

                    System.out.println("Insert Vf -->");
                    Vf = input.nextInt();

                    System.out.println("Insert Vi -->");
                    Vi = input.nextInt();

                    System.out.println("Insert t -->");
                    t = input.nextInt();

                    aceleration = (Vf - Vi) / t;
                    System.out.println(" aceleration is -> " + aceleration);

                    break;

                case 2:

                    double V;
                    double T;
                    double MovementUniform;

                    System.out.println("Insert V -->");
                    V = input.nextInt();

                    System.out.println("Insert T -->");
                    T = input.nextInt();

                    MovementUniform = (V * T);
                    System.out.println(" MovementUniform is -> " + MovementUniform);
                    break;

                case 3:

                    double vf;
                    double vi;
                    double a;
                    double time;

                    System.out.println("Insert vf -->");
                    vf = input.nextInt();
                    
                    System.out.println("Insert vi -->");
                    vi = input.nextInt();
                    
                    System.out.println("Insert a -->");
                    a = input.nextInt();
                    
                    

                    time = ((vf - vi) / a);
                    System.out.println(" time is -> " + time);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 3);   
            }

    }



    

