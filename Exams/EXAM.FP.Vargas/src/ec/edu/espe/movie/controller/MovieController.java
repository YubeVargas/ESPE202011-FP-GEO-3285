/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.movie.controller;

import ec.edu.espe.movie.model.Movie;
import utils.FileManager;

/**
 *
 * @author David V
 */
public class MovieController {
    
    public void save(Movie movie){
        
        String data = movie.getName() + ";" + movie.getGender() + ";" + movie.getReleaseyear() + ";" + movie.getDuration() + ";" + movie.getEntrancecost();
        FileManager.save(data, "movie");
        
        }
        public String read() {

        String data;
        data = FileManager.read("movie.csv");
        return data;
    }
    }
    

