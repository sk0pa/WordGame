package com.epam.khalii.WordGame.GameLogic;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Created by Skopa on 17.05.2015.
 */
public class Game implements Playable {
    static char last = 'a';
    private static final Logger gameLog = Logger.getLogger(Game.class.getName());

    public void start(ArrayList<Player> players){
        System.out.println("Start game with A letter. Go!");
        int playersNumber = players.size();
        while(playersNumber>1){
            for(int i=0; i<playersNumber; i++){
                last = players.get(i).move(last);
                if(last=='0'){
                    System.out.println("Player "+players.get(i).getName()+" lose");
                    players.remove(i);
                    playersNumber--;
                }
            }
        }
        System.out.println("Player "+players.get(0).getName()+" WIN!!!");
        gameLog.info("Game over");
    }
}
