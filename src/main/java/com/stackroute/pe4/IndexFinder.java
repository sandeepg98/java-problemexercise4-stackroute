package com.stackroute.pe4;

import java.util.regex.*;

public class IndexFinder {

    public String findIndex(String text, String key) {

        //Create an empty output string
        String output = "";

        //Set up the pattern "key" and target "text"
        Pattern pattern = Pattern.compile(key);
        Matcher matcher = pattern.matcher(text);
        boolean found = false;

        //Loop through the target text to find the pattern key in it
        while (matcher.find()) {

            //if the key is found, store it in output text and set found flag to true.
            output = output + "Start index " +  matcher.start() + " End index " + matcher.end() + "\n";
            found = true;
        }
        if (!found)
            return "No match found.";

        return output.trim();
    }
}
