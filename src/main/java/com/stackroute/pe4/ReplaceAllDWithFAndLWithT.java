package com.stackroute.pe4;

public class ReplaceAllDWithFAndLWithT {

    /*replace all occurances of 'd' with 'f' and 'l' with 't' */
    public String replaceAllDWithFAndLWithT(String string){

        /*if string is null return null */
        if (string==null){
            return null;
        }
        /*if string is not null then replcae all occurances of 'd' with 'f',
        *                                                       'l' with 't'
        * */
        string=string.replaceAll("d","f");
        string=string.replaceAll("l","t");
        return string;
    }
}
