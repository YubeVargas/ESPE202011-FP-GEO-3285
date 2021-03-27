/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.countrynames.conntroller;

/**
 *
 * @author David V
 */
public class searchcountry {
    
    public static int findCountry(String[] countries, String a){
        
        for(int i = 0; i < countries.length; i++){
            if(countries[i].equals(a)){
                return i;
            }
        }
        return-1;
    }
    
}
