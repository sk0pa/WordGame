package com.epam.khalii.WordGame.GameLogic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ComputerTest {

    @Before
    public void setUp() throws Exception {
        Player.cities = new ArrayList<String>();
        Player.cities.add("Elend");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMove() throws Exception {
        Computer c = new Computer("Computer");
        assertEquals(c.move('e'), 'd');
    }
}