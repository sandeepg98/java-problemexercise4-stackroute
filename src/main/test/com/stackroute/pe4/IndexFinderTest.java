package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndexFinderTest {
    IndexFinder object;

    @Before
    public void setUp() {
        object = new IndexFinder();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //For cases in which key is actually present
    @Test
    public void findIndexIfKeyIsPresent() {
        String output= object.findIndex("ishapharryhhh ry","ry");;
        assertEquals("Start index 8 End index 10\n" +
                              "Start index 14 End index 16", output);
    }

    //For cases in which key is not present
    @Test
    public void findIndexIfKeyIsNotPresent() {
        String output= object.findIndex("ishapharryhhh ry","xyz");;
        assertEquals("No match found.", output);
    }

    //For cases in which string is empty
    @Test
    public void findIndexIfStringIsEmpty() {
        String output= object.findIndex("","xyz");;
        assertEquals("No match found.", output);
    }
}