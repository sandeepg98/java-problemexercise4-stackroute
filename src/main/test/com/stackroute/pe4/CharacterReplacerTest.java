package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplacerTest {

    CharacterReplacer object;

    @Before
    public void setUp() {
        object = new CharacterReplacer();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //For strings having the key character(s) (all in small)
    @Test
    public void replaceIfSmallCharIsPresent() {
        String output = object.characterReplace("daily dry");
        assertEquals("faity fry", output);
    }

    //For strings having the key character(s) (some or all in capital)
    @Test
    public void replaceIfCapitalCharIsPresent() {
        String output = object.characterReplace("Daily Dry");
        assertEquals("faity fry", output);
    }

    //For strings not having the key character(s)
    @Test
    public void replaceIfCharIsNotPresent() {
        String output = object.characterReplace("Tingu Singh");
        assertEquals("tingu singh", output);
    }

    //For strings is empty
    @Test
    public void replaceIfStringIsEmpty() {
        String output = object.characterReplace("");
        assertEquals("", output);
    }
}