/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

/**
 *
 * @author David V
 */
public class WS12LIBRARIES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float absoluteValue;

        number = 9; 
        squareRoot = (float) Math.sqrt(number);
        System.out.println("the square root of -> " + number + " <- is -> " + squareRoot);

        number = 49; // ? 7
        squareRoot = (float) Math.sqrt(number);
        System.out.println("the square root of -> " + number + " <- is -> " + squareRoot);

        number = 5;   // ? 2.23
        squareRoot = (float) Math.sqrt(number);
        System.out.println("the square root of -> " + number + " <- is -> " + squareRoot);

        base = 4.0F;
        exponent = 0.5F;
       
        power = (float) Math.pow(base, exponent);
        System.out.println(base + "^" + exponent + " = " + power);

        power = computePower(base, exponent);
        System.out.println(base + "^" + exponent + " = " + power);

        base = 2;
        exponent = 4;

        base = 78;
        exponent = 5;
        
        number = -5;
        absoluteValue = getAbsoluteValue(number);
        System.out.println("abs of ( " + number + " ) is -> " + absoluteValue);

            }

    public static float computePower(float base, float exponent) {
        float power;
        power = 1.0F;

        for (int i = 1; i <= (int) exponent; i++) {
            power = power * base;
        }

        return power;
    }

    private static float getAbsoluteValue(float number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }

}
    
    

