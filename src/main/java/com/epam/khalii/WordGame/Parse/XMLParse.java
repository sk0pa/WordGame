package com.epam.khalii.WordGame.Parse;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


import org.jdom2.*;
import org.jdom2.input.SAXBuilder;

/**
 * Created by Skopa on 16.05.2015.
 */
public class XMLParse extends AbstractDAO {
    @Override
    public ArrayList<String> getAll(){
        try{
            SAXBuilder parser = new SAXBuilder();
            FileReader fr = new FileReader("src/cities.xml");
            Document rDoc = parser.build(fr);
            List<Element> temp = rDoc.getRootElement().getChildren();
            ArrayList<String> cities = new ArrayList<String>();
            for (int i = 0; i < temp.size(); ++i) {
                if (temp.get(i).getName().equals("City")){
                    cities.add(temp.get(i).getValue());
                }
            }
            return cities;
        } catch (Exception e) {
            System.out.println("Ooops...");
            return null;
        }
    }
}
