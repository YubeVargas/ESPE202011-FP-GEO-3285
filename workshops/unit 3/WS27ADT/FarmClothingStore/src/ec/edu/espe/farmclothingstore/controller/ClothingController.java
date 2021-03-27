/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmclothingstore.controller;

import ec.edu.espe.farmclothingstore.model.Clothing;
import utils.FileManager;

/**
 *
 * @author David V
 */
public class ClothingController {
    
    public void save(Clothing clothing){
        
        String data = clothing.getBrand() + "," + clothing.getSize() + "," + clothing.getGarments() + "," + clothing.getSection() + "," + clothing.getCost();
        FileManager.save(data, "clothings");
    }
    
}
