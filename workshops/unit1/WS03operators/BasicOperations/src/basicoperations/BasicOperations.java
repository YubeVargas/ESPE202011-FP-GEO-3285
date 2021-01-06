/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author David V
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addent1;
        int addent2;
        int minuend;
        int sustrahend;
        int difference;
        int multiplicant;
        int multiplier;
        int product;
        int divisor;
        int dividend;
        int quotient;
        int modulos;
        
        
        addent1 = 5;
        addent2 = 18;
        minuend = -23;
        sustrahend = -6;
        multiplicant = -9;
        multiplier = -12;
        divisor = 7;
        dividend = 63;
        
        sum = addent1 + addent2;
        
        System.out.println(" the addition of " + addent1 + " + " + addent2 + " is equal to --> " + sum);
        
        ++sum;
        
        System.out.println(" sum is equal to --> " + sum);
        
        sum++;
        
        System.out.println(" sum is equal to --> " +sum);
        System.out.println(" adding one to sum " + (sum++));
        System.out.println(" adding one to sum " + (++sum));
        
        System.out.println(" the substraction of " + minuend + " - " + sustrahend + " is equal to " +(minuend -sustrahend));
        
        difference = minuend -sustrahend;
        
        System.out.println(" difference is equal to --> " + difference);
        
        product = multiplicant*multiplier;
        
        System.out.println(" the multiplication of " + multiplicant + " * " + multiplier + " is equal to --> " + product);
        
        quotient = dividend / divisor;
        
        System.out.println(" the division of " + dividend + " / " + divisor + " is equal to --> " + quotient );
        
        modulos = dividend % divisor;
        
        System.out.println(" the residue of the division " + dividend + " / " + divisor + " is equal to --> " + modulos);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
                
        
        
              
                
                
               
    }
    
}
