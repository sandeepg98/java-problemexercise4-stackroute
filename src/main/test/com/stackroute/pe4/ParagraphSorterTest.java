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

    //if string is not empty and contains all small characters
    @Test
    public void sortIfSmallCharIsPresent() {
        String output = object.sortParagraph("a quick brown fox jumps over the lazy dog");
        assertEquals("a brown dog fox jumps lazy over quick the", output);
    }

    //if string is not empty and doesn't contain all small characters
    @Test
    public void sortIfCapitalCharIsPresent() {
        String output = object.sortParagraph("A Quick brown fox Jumps over the lazy dog");
        assertEquals("A brown dog fox Jumps lazy over Quick the", output);
    }

    //if string is empty.
    @Test
    public void sortIfStringIsEmpty() {
        String output = object.sortParagraph("");
        assertEquals("", output);
    }
}