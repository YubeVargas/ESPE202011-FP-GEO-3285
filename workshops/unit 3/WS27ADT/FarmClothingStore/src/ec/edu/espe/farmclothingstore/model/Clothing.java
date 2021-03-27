/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmclothingstore.model;

/**
 *
 * @author David V
 */
public class Clothing {
    private String brand;
    private String size;
    private String garments;
    private String section;
    private float cost;

    public Clothing(String brand, String size, String garments, String section, float cost) {
        this.brand = brand;
        this.size = size;
        this.garments = garments;
        this.section = section;
        this.cost = cost;
    }
    
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the garments
     */
    public String getGarments() {
        return garments;
    }

    /**
     * @param garments the garments to set
     */
    public void setGarments(String garments) {
        this.garments = garments;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
    
}
