package com.epam.khalii.WordGame.GameLogic;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Skopa on 17.05.2015.
 */
public class Computer extends Player {
    @Override
    public char move(char last) {
        ArrayList<String> subList = new ArrayList<String>();
        for(String city : Player.cities){
            if (Character.toLowerCase(city.charAt(0))==last)
                subList.add(city);
        }
        if(!subList.isEmpty()){
            Random r = new Random();
            int word = r.nextInt(subList.size());
            String city = subList.get(word);
            System.out.println(city);
            Player.cities.remove(city);
            return city.charAt(city.length()-1);
        }
        return '0';
    }

    public Computer(String name) {
        super(name);
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
