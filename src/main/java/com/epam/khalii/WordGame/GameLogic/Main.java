package com.epam.khalii.WordGame.GameLogic;

import com.epam.khalii.WordGame.Parse.XMLParse;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Created by Skopa on 17.05.2015.
 */
public class Main {

    public static void main(String[] args) {
        Player.cities = new XMLParse().getAll();
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new User("User"));
        players.add(new Computer("Computer"));
        Game game = new Game();
        game.start(players);
    }
}
