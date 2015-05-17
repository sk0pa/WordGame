package com.epam.khalii.WordGame.Parse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.SplittableRandom;

import static org.junit.Assert.*;

/**
 * Created by Skopa on 17.05.2015.
 */
public class SQLParseTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAll() throws Exception {
        SQLParse sqlParse = new SQLParse();
        ArrayList<String> list = sqlParse.getAll();
        assertTrue(list.contains("Wiggins"));
    }
}