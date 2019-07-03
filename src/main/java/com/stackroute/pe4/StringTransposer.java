package com.stackroute.pe4;

public class StringTransposer {

    public static String stringTranspose(String input){

        //Create a String Array 'inputArray' to store each word of the input string
        String[] inputArray = input.split("\\s");

        //Create an empty String to store result
        String transpose = "";

        for(String i:inputArray){

            //Logic to reverse each word
            StringBuilder temp = new StringBuilder(i);
            temp.reverse();

            //keep adding all the reversed elements of array
            transpose = transpose + temp.toString() + " ";
        }

        return transpose.trim();
    }
}
