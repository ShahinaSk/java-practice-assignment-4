package com.stackroute.pe4;

public class FindTransposeOfString {

    public String transposeString(String string){
        /*if string is null return null */
        if (string==null){
            return null;
        }
        /*if proper string is given split it into string array */
        String[] strings=string.split(" ");
        string="";
        int index=0;
        /*from index 0-last index of string array reverse string and append to string variable*/
        while (index<strings.length){
            string+=new StringBuffer(strings[index]).reverse().toString()+" ";
            index++;
        }
        return string.trim();
    }
}
