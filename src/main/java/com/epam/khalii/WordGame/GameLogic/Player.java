package com.epam.khalii.WordGame.GameLogic;

import java.util.ArrayList;

/**
 * Created by Skopa on 16.05.2015.
 */
public abstract class Player {
    public static ArrayList<String> cities;
    private String name;
    public abstract char move(char last);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
