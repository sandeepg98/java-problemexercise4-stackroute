package com.stackroute.pe4;

public class HarryFinder {

    public static boolean findHarry(String input){

        //Convert the input string to lower case and check for "harry"
        if(input.toLowerCase().contains("harry"))
            return true;

        return false;
    }
}
