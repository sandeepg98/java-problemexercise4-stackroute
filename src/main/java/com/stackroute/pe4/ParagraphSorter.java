package com.stackroute.pe4;

import java.util.Arrays;

public class ParagraphSorter {

    public static String sortParagraph(String input){

        //Create a String Array 'inputArray' to store each word of the input string
        String[] inputArray = input.split(" ");

        //Sort the 'inputArray'
        Arrays.sort(inputArray, String.CASE_INSENSITIVE_ORDER);

        //Create an empty String and keep adding all the sorted elements of array in it
        String sortedArray = "";

        for(String i:inputArray){
            sortedArray = sortedArray + i + " ";
        }

        return sortedArray.trim();
    }
}
