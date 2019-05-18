package com.stackroute.pe4;

import java.util.Arrays;

public class SortStringInAlphabeticalOrder {

    /*sort given string array in alphabetical order*/
    public String sortString(String string){
        /*if string is null return null*/
        if (string==null){
            return null;
        }
        /*split string into string array */
        String[] strings=string.split(" ");
        /*sort using Arrays class sort method */
        Arrays.sort(strings);
        return Arrays.toString(strings);
    }
}
