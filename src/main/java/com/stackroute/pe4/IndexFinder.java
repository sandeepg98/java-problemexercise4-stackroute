package com.stackroute.pe4;

import java.util.regex.*;

public class IndexFinder {

    public String findIndex(String text, String key) {

        String output = "";

        Pattern pattern = Pattern.compile(key);
        Matcher matcher = pattern.matcher(text);
        boolean found = false;

        while (matcher.find()) {
            output = output + "Start index " +  matcher.start() + " End index " + matcher.end() + "\n";
            found = true;
        }
        if (!found)
            return "No match found.";

        return output.trim();
    }
}
