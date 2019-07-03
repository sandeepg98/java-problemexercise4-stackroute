package com.stackroute.pe4;

public class CharacterReplacer {

    public static String characterReplace(String input){

        //Convert the string to lower case & replace all the key characters with their target characters
        String result = input.toLowerCase().replaceAll("d", "f").replaceAll("l", "t");

        return result;
    }
}
