/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

/**
 *
 * @author David V
 */
public class BasicTax {
   
    public static float computeIva (float basePrice, float percentajeValue){
        float iva;
        iva = basePrice * percentajeValue / 100;
        return iva;
    }
}
    

