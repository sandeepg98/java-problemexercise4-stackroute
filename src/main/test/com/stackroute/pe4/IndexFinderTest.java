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

    @Test
    public void findIndexTest() {
        String result= object.findIndex("ishapharryhhh ry","ry");;
        assertEquals("Start index 8 End index 10\n" +
                              "Start index 14 End index 16",result);
    }
}