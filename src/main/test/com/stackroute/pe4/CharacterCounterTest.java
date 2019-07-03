package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCounterTest {

    CharacterCounter object;

    @Before
    public void setUp() {
        object = new CharacterCounter();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //For strings having the key character (small)
    @Test
    public void countIfSmallCharIsPresent() {
        long output = object.characterCount("utkarsh Anand", 'a');
        assertEquals(3, output);
    }

    //For strings having the key character (capital)
    @Test
    public void countIfCapitalCharIsPresent() {
        long output = object.characterCount("utkarsh Anand", 'A');
        assertEquals(3, output);
    }

    //For strings not having the key character
    @Test
    public void countIfCharIsNotPresent() {
        long output = object.characterCount("utkarsh Anand", 'x');
        assertEquals(0, output);
    }
}