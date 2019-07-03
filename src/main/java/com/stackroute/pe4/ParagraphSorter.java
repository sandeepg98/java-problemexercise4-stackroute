package com.stackroute.pe4;

import java.util.Arrays;

public class ParagraphSorter {

    public static String sortParagraph(String input){

        String[] inputArray = input.split(" ");
        Arrays.sort(inputArray);

        String sortedArray = "";

        for(String i:inputArray){
            sortedArray = sortedArray + i + " ";
        }

        return sortedArray.trim();
    }
}
