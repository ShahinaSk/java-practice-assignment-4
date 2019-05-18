package com.stackroute.pe4;

public class CountOfOccurancesOfCharInString {

    public  int noOfOccurancesOfChar(String string,char key){

        /*if String is null return -1 */
        if (string==null){
            return -1;
        }
        /*if key is blank return -1*/
        if (key==' '){
            return -1;
        }
        /*if both string and key given replace all occurances of key with blank,
        find differences of lengths of both string and result
        */

        String result=string.replaceAll(String.valueOf(key),"");
        return string.length()-result.length();
    }

}
