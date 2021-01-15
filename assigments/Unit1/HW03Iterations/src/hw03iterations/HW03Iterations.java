/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

/**
 *
 * @author David V
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 45 ====");

        while (i < 48) {
            System.out.println("i -> " + (i + 1));
            //i += 1;
            i++;
            //i = i + 1;
        }

        System.out.println("first 45 even numbers");
        i = 2;
        while (i <= 45) {
            System.out.println(i + " -> is even");
            i += 2;
        }

        System.out.println("First 45 odd numbers");
        
        int stop;
        stop = 48;
        for(int y=1 ; y < stop ; y+=2){
            System.out.println("odd number -> " + y);
        }
        
        System.out.println("Multiplication Tables : 45");
        int top=12;
        int product=0;
        int table = 48;
        for (int y = 1 ; y <= top ; y++){
            product = table * y;
            System.out.println("45 * " + y + " = " + product);
        }    
        
        for (char x='/'; x >= '+'; x--) {
        for (char y=x; y >= '+'; y--) { 
            System.out.print(y);
        }
        System.out.println();
        }
        }   
        }
    

