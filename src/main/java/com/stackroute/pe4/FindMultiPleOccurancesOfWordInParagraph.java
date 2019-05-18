package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMultiPleOccurancesOfWordInParagraph {

    public  String[] findMultipleOccurancesOfString(String string,String key){

        /*only if given string is not null and given target is not null check for the occurances of word in string*/

        if (string!=null && key!=null){
            StringBuffer stringBuffer=new StringBuffer("");
            Pattern pattern=Pattern.compile(key);
            Matcher matcher=pattern.matcher(string);

            while(matcher.find()){
                int start = matcher.start();
                int end=matcher.end();

                /*append result ot the StringBuffer*/

                stringBuffer.append("Found at:"+start+"-"+end+"\n");
            }
            return stringBuffer.toString().split("\n");
        }

        /*if either string or key is null return null*/

        return null;
    }
}
