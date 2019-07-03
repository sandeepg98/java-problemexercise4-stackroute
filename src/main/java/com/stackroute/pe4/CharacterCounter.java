package com.stackroute.pe4;

public class CharacterCounter {

    public static long characterCount(String input, char key){

        //Convert the character key to string in order to use replaceAll()
        String toFind = Character.toString(key).toLowerCase();

        //Remove the key from the actual string and store in a temporary string
        String temp = input.toLowerCase().replaceAll(toFind, "");

        long lengthOriginal = input.length();
        long lengthNew = temp.length();

        //Difference in the lengths of actual and temporary array is the count of character
        return lengthOriginal-lengthNew;
    }
}
