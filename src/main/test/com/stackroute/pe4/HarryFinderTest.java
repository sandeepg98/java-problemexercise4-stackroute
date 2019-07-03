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

    @Test
    public void ifHarryIsPresent() {
        boolean output = object.findHarry("This is Harry");
        assertTrue(output);
    }

    @Test
    public void ifHarryIsNotPresent() {
        boolean output = object.findHarry("This is Henry");
        assertFalse(output);
    }
}