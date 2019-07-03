package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphSorterTest {
    ParagraphSorter object;

    @Before
    public void setUp() {
        object = new ParagraphSorter();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void replaceIfSmallCharIsPresent() {
        String output = object.sortParagraph("a quick brown fox jumps over the lazy dog");
        assertEquals("a brown dog fox jumps lazy over quick the", output);
    }
}