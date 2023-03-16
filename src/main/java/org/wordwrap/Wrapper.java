package org.wordwrap;

import org.wordwrap.exeptions.NegativeNumberExeption;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

    // Crear una List<Char>

    public static String wrap(String textString, int columNumber) throws NegativeNumberExeption {

        if ( textString == null || textString.isEmpty() ){
            return "0";
        } else if ( columNumber < 0 ) {
            throw new NegativeNumberExeption("Negatives numbers not allowed");
        }

        return textString;
    }

}
