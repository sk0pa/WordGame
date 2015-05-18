package com.epam.khalii.WordGame.Parse;

import java.io.*;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by Skopa on 16.05.2015.
 */
public class JSONParse extends AbstractDAO {
    @Override
    public ArrayList<String> getAll() {
        ArrayList<String> cities = new ArrayList<String>();
            try {
                FileReader reader = new FileReader(
                        "src/cities.json");

                JSONParser jsonParser = new JSONParser();

                JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
                JSONArray lang = (JSONArray) jsonObject.get("City");
                for (int i = 0; i < lang.size(); i++) {
                    String city = (String) lang.get(i);
                    cities.add(city.toLowerCase());
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex2) {
                ex2.printStackTrace();
            } catch (ParseException ex3) {
                ex3.printStackTrace();
            } catch (NullPointerException ex4) {
                ex4.printStackTrace();
            }
            return cities;
    }
}

