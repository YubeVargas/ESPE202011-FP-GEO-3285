/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diameter.of.a.circle;

/**
 *
 * @author David V
 */
public class DiameterOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // A man wants to buy 2 sources for his house 
        
        int n;
        int cost;
        int cash;
        
        
        n = 2;
        cost = 450;
        
        
        cash = cost * n;
        
        System.out.println("The cash from sources " + cost + " * " + n + "is equal to --> " + cash);
        
        //The man knows that the sources have a diameter of 3 meters
        
        float diameter;
        float x; 
        float radio;
        
        diameter = 3;
        x = 2;
        
        radio = (float) (diameter / x);
        
        System.out.println("The radio from the sources" + diameter + " / " + x + "is equal to --> " + radio);
        
        //The man liked other sources that have a radius of 2 meters, how much would be the diameter of those sources
        
        short rad;
        short diam;
        
        rad = 2;
        
        diam = (short) (rad + rad);
        
        System.out.println("The diameter from the sources" + rad + " + " + rad + "is equal to --> " + diam);
        
       // In addition, the man to buy the sources has a capital of 1000 dollars, if he would buy only 2 sources when he had spare
       
       int residue;
       int capital;
       
       capital = 1000;
       
       residue = (capital - cash);
       
       System.out.print("The residue is" + capital + " - " + cash + " is equal to --> " + residue);
       
                 
    }
    
}
