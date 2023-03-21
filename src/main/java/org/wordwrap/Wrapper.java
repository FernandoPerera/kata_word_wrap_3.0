package org.wordwrap;

import org.wordwrap.exeptions.NegativeNumberExeption;

import java.util.List;

public class Wrapper {

    public static String wrap(String textString, int columNumber) throws NegativeNumberExeption {

        if ( columNumber < 0 ) {
            throw new NegativeNumberExeption("Negatives numbers not allowed");
        }

        boolean isEmptyOrNull = textString == null || textString.isEmpty();

        if (isEmptyOrNull){
            return "0";
        }

        return columNumber > textString.length()
                ? textString
                : insertBreakLinesIntoTextString(List.of(textString.split("")), columNumber);

    }
    private static String insertBreakLinesIntoTextString(List<String> charList, int columnNumber){

        String response = "";

        for (int index = 0; index < charList.size() ; index++) {

            boolean shouldAddLineBreak = index % columnNumber == 0 && index > 0;

            if (shouldAddLineBreak){
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
