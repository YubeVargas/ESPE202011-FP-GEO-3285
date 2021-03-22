/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searchiing;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class Hw18Searchiing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int arrangement[] = {2, 5, 7, 9, 11, 14, 17, 21, 24, 29, 31, 35,  38, 40};
        int n = arrangement.length;
        int x;
        int result;
        System.out.println("Author: Vargas Yubelly");
        System.out.println("Enter value1");
        x = input.nextInt();
        result = BinarySearch.binarySearch(arrangement, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Value not present");
        } else {
            System.out.println("Value found at index " + result);         
        }
        System.out.println("Enter value2");
        x = input.nextInt(); 
        result = LinearSearch.search(arrangement, x);
          if (result == -1) {
            System.out.println("value not present");
        } else {
            System.out.println("value found at index " + result);         
        }
          }
    
}

    

          
    


