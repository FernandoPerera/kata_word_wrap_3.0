package org.wordwrap;

import org.wordwrap.exeptions.NegativeNumberExeption;

import java.util.List;

public class Wrapper {

    public static String wrap(String textString, int columNumber) throws NegativeNumberExeption {

        if ( textString == null || textString.isEmpty() ){
            return "0";
        } else if ( columNumber < 0 ) {
            throw new NegativeNumberExeption("Negatives numbers not allowed");
        }

        return columNumber > textString.length()
                ? textString
                : insertBreakLinesIntoTextString(List.of(textString.split("")));

    }
    private static String insertBreakLinesIntoTextString(List<String> charList){

        String response = "";

        for (int index = 0; index < charList.size() ; index++) {

            if ( index % 10 == 0 && index > 0){
                response += charList.get(index).equals(" ")
                        ? "\n"
                        : charList.get(index) + "\n";
            } else {
                response += charList.get(index);
            }
        }

        return response;
    }

}
