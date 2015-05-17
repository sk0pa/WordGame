package com.epam.khalii.WordGame.Parse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Skopa on 16.05.2015.
 */
public class TXTParse extends AbstractDAO{
    @Override
    public ArrayList<String> getAll() {
        try {
            FileReader fileReader = new FileReader("src/cities.txt");
            BufferedReader textReader = new BufferedReader(fileReader);
            int numberOfLines = 330;
            ArrayList<String> cities = new ArrayList<String>();
            for(int i=0; i<numberOfLines;i++){
                cities.add(textReader.readLine());
            }
            return cities;
        } catch (FileNotFoundException e){
            e.getStackTrace();
        }
        catch (Exception e){
            System.out.println("Ooops...");
            e.getStackTrace();
        }
        return null;
    }
}
