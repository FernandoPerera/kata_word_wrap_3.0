package org.wordwrap;

public class Wrapper {

    public static String wrap(String textString, int columNumber){

        if ( textString == null || textString.isEmpty() ){
            return "0";
        }

        return textString;

    }

}
