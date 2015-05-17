package com.epam.khalii.WordGame.GameLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Skopa on 17.05.2015.
 */
public class User extends Player {
    public User(String name) {
        super(name);
    }

    @Override
    public char move(char last) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String city = in.readLine();
            if(Player.cities.contains(city)){
                Player.cities.remove(city);
                return city.charAt(city.length()-1);
            } else{
                return '0';
            }
        } catch (IOException e){
        return '0';
        }
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
