/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author David V
 */
public class FileManager {
     public static boolean createFile(String fileName){
        boolean created = false;
        try {
            java.io.File file = new java.io.File(fileName + ".txt");
            if (file.createNewFile()){
                System.out.println("file was created");
                
                created = true;
            } else{
                System.out.println("file already exists");
                created = false;
            }
        } catch (IOException ex){
            ex.printStackTrace();
            created = false;
        }
        return created;
    }
    
    public static boolean save(String data, String fileName){
        boolean saved = false;
        
        createFile(fileName);
        
        try {
            FileWriter ayWrite = new FileWriter(fileName + ".csv", true);
            ayWrite.write(System.getProperty("Line.separator") + data);
            ayWrite.close();
            System.out.println("a new record of" + fileName + "was saved");
            saved = true;
            
            
        } catch(IOException ex){
            ex.printStackTrace();
            saved = false;
        }
        return saved;
    }

    public static String read(String fileName) {
        fileName = null;
        String text = null;
        String document = "C:\\Users\\David V\\Desktop\\Programacion Y\\ESPE202011-FP-GEO-3285\\Exams\\Cinema theatre\\movie.txt";
        try ( BufferedReader textBr = new BufferedReader(new FileReader(document))) {
            while ((fileName = textBr.readLine()) != null) {
                text = fileName;
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return text;
    }

 }

