package com.epam.khalii.WordGame.GameLogic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserTest {

    @Before
    public void setUp() throws Exception {
        Player.cities = new ArrayList<String>();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMove() throws Exception {
        User user = new User("User");
        assertEquals('0', user.move('a'));
    }
}