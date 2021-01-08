/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.util.Scanner;

/**
 *
 * @author David V
 */
public class FP02_controlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n= 0;
  Scanner scanner = new Scanner(System.in);
  System.out.printf("Please enter a number ---> ");
  int num = scanner.nextInt(); 
        System.out.println("You entered--->" +num);
        if (num%2==0)
        {
            System.out.println("number " +num+ " even");
        }else {
            System.out.println("number " +num+ " odd");
        }
    }
    
}
