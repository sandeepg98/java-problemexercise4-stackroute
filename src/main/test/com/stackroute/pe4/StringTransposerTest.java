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

    @Test
    public void replaceIfSmallCharIsPresent() {
        String output = object.stringTranspose("my name is khan");
        assertEquals("ym eman si nahk", output);
    }
}