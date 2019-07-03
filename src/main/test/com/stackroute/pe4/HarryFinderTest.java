package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryFinderTest {
    HarryFinder object;

    @Before
    public void setUp() {
        object = new HarryFinder();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //For strings that contain "Harry"
    @Test
    public void ifHarryIsPresent() {
        boolean output = object.findHarry("This is Harry");
        assertTrue(output);
    }

    //For strings that don't contain "Harry"
    @Test
    public void ifHarryIsNotPresent() {
        boolean output = object.findHarry("This is Henry");
        assertFalse(output);
    }

    //For empty strings
    @Test
    public void ifStringIsEmpty() {
        boolean output = object.findHarry("");
        assertFalse(output);
    }
}