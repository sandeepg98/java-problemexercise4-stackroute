package com.stackroute.pe4;

public class StringTransposer {

    public static String stringTranspose(String input){

        String[] inputArray = input.split("\\s");
        String transpose = "";

        for(String i:inputArray){
            StringBuilder temp = new StringBuilder(i);
            temp.reverse();

            transpose = transpose + temp.toString() + " ";
        }

        return transpose.trim();
    }
}
