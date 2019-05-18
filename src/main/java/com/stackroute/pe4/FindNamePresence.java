package com.stackroute.pe4;

import java.util.regex.Pattern;

public class FindNamePresence {

    public String findName(String string,String target){
        if (string!=null && target!=null){
            /*if (string.contains(target)){
                return "Is "+target+" here ? true";
            }else {
                return "Is "+target+" here ? False";
            }*/
//            String patternString=
            boolean isMatch=Pattern.matches(".*"+target+".*",string);
            System.out.println(isMatch);
            return "Is "+target+" here ? "+isMatch;
        }
        return null;
    }
}
