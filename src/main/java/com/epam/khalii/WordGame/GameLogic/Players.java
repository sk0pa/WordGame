package com.epam.khalii.WordGame.GameLogic;

import java.util.ArrayList;

/**
 * Created by Anhelina_Khalii on 18.05.2015.
 */
public interface Players {
    public static ArrayList<String> cities = new ArrayList<String>();
    public abstract char move(char last);
}
