package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposerTest {

    StringTransposer object;

    @Before
    public void setUp() {
        object = new StringTransposer();
    }

    @After
    public void tearDown() {
        object = null;
    }

    //if string is not empty and contains all small characters
    @Test
    public void transposeIfSmallCharIsPresent() {
        String output = object.stringTranspose("my name is khan");
        assertEquals("ym eman si nahk", output);
    }

    //if string is not empty and doesn't contain all small characters
    @Test
    public void transposeIfCapitalCharIsPresent() {
        String output = object.stringTranspose("My Name Is Khan");
        assertEquals("yM emaN sI nahK", output);
    }

    //if string is empty
    @Test
    public void transposeIfStringIsEmpty() {
        String output = object.stringTranspose("");
        assertEquals("", output);
    }
}