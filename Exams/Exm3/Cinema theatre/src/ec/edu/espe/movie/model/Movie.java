/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.movie.model;

/**
 *
 * @author David V
 */
public class Movie {
    private String name;
    private String gender;
    private int releaseyear;
    private float duration;
    private float entrancecost;

    public Movie(String name, String gender, int releaseyear, float duration, float entrancecost) {
        this.name = name;
        this.gender = gender;
        this.releaseyear = releaseyear;
        this.duration = duration;
        this.entrancecost = entrancecost;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the releaseyear
     */
    public int getReleaseyear() {
        return releaseyear;
    }

    /**
     * @param releaseyear the releaseyear to set
     */
    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    /**
     * @return the duration
     */
    public float getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }

    /**
     * @return the entrancecost
     */
    public float getEntrancecost() {
        return entrancecost;
    }

    /**
     * @param entrancecost the entrancecost to set
     */
    public void setEntrancecost(float entrancecost) {
        this.entrancecost = entrancecost;
    }
    
}
