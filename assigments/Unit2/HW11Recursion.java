/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        double Coordinatex1;
        double Coordinatex2;
        double Coordinatey1;
        double Coordinatey2;
        double dist;
        
        double Sx1;
        double Sx2;
        double Sy1;
        double Sy2;
        double disites;
        
        int Cv = 0;
        int Ov = 0;
        final int quantity = 100;
        float y = 0; 
      y= NumberOfInhabitants(Cv,Ov, quantity );
      
        int Rvs;
        int Rsrv;
        int RiversAndReserves;
      
        
        
        
        System.out.println(" <-- Insert a coordinatex1 -->");
        Coordinatex1 = input.nextInt();
        
        System.out.println(" <-- Insert a coordinatex2 -->");
        Coordinatex2 = input.nextInt();
        
        System.out.println(" <-- Insert a coordinatey1 -->");
        Coordinatey1 = input.nextInt();
        
        System.out.println(" <-- Insert a coordinatey2 -->");
        Coordinatey2 = input.nextInt();
        
        dist = DistanceVolcanoes (Coordinatex1, Coordinatex2, Coordinatey1, Coordinatey2);
        System.out.println(" <- dist is -> " + dist);
        
        System.out.println(" <-- Insert a Sx1 -->");
        Sx1 = input.nextInt();
        
        System.out.println(" <-- Insert a Sx2 -->");
        Sx2 = input.nextInt();
        
        System.out.println(" <-- Insert a Sy1 -->");
        Sy1 = input.nextInt();
        
        System.out.println(" <-- Insert a Sy2 -->");
        Sy2 = input.nextInt();
        
        disites = DistanceBetweenSites (Sx1, Sx2, Sy1, Sy2);
        System.out.println(" <- disites is -> " + disites);
        
        System.out.println("The percentage is");
                    System.out.println("enter Cv -> ");
                    Cv = input.nextInt();
                    System.out.println("enter Ov -> ");
                    Ov = input.nextInt();
                    y = ((Cv - Ov )/ Ov)* quantity;
       
        y = NumberOfInhabitants(Cv,Ov, quantity);
        System.out.println(" percentage of" + y + "is equal to ->" + y);
        
        
        int number = 4;
        int fact = 0;
        fact = factorial(number);;

        System.out.println("factorial of " + number + " is equal to -> " + fact);
        
        System.out.println("Enter the amount of rivers -> ");
        Rvs = input.nextInt();

        System.out.println("Enter the amount ofwildlifeReserves -> ");
        Rsrv = input.nextInt();

        RiversAndReserves(Rvs, Rsrv);
        
        }
        
        
        public static double DistanceVolcanoes(double Coordinatex1, double Coordinatex2,double Coordinatey1, double Coordinatey2){
        double dist;
        double first;
        double second;
        first = Math.pow(Coordinatex2 - Coordinatex1,2);
        second = Math.pow(Coordinatey2 - Coordinatey1, 2);
        
        dist = (double) Math.sqrt(first + second);
        
        return (double) dist;
        
        }
        
        public static double DistanceBetweenSites(double Sx1, double Sx2,double Sy1, double Sy2){
        double disites;
        double place1;
        double place2;
        place1 = Math.pow(Sx2 - Sx1,2);
        place2 = Math.pow(Sy2 - Sy1, 2);
        
        disites= (double) Math.sqrt( place1 + place2);
        
        return (double) disites;
        }
        
        public static float NumberOfInhabitants(int Cv, int Ov, int quantity) {
        float y = 0.0F;

        y = (((float) Cv - (float) Ov) / (float) Ov) * quantity;

        return y;
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));
                
            }
            
    
    }

}
    public static int RiversAndReserves(int Rvs, int Rsrv) {
        
        int RiversAndReserves;
        RiversAndReserves = Rvs + Rsrv;
        System.out.println("total between rivers and reserves --> " + RiversAndReserves);
        return RiversAndReserves;
    }
}
    
             
        
        
        
    
    

