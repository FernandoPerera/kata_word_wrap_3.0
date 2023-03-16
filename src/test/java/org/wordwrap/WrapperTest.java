package org.wordwrap;

import org.junit.jupiter.api.Test;
import org.wordwrap.exeptions.NegativeNumberExeption;

import static org.junit.jupiter.api.Assertions.*;

public class WrapperTest {

    /*
     *   Casos de uso :
     *
     *       - Si llega una cadena vacía devolver 0.
     *
     *       - Si llega una cadena con valor nulo devolver 0.
     *
     *       - Si la cadena tiene una menor longitud que el número
     *         de columna devolver la misma cadena.
     *
     *       - Si el número de columna introducido es menor que 0
     *         devolver un throw.
     *
     *       - Si una palabra tiene una longitud mayor que el número de
     *         columna realizar un salto de línea.
     *
     *       - Si se introduce una cadena y número de columna correcto
     *         devolver el resultado esperado.
     */

    private static final String STRING_TO_SEND = "Nuevo test de la kata Wrapper 3.0 con gradle y helicoptero";
    private static final String CORRECT_RESPONSE_WITH_10 = "Nuevo test\nde la kata\nWrapper 3.\n0 con grad\nle y helic\noptero";

    @Test
    void given_empty_string_return_zero() throws NegativeNumberExeption {

        assertEquals("0", Wrapper.wrap("", 0));
    }

    @Test
    void given_null_value_return_zero() throws NegativeNumberExeption {

        assertEquals("0", Wrapper.wrap(null, 0));
    }

    @Test
    void given_shorter_length_of_text_string_than_column_number_return_same_text_string() throws NegativeNumberExeption {

        assertEquals(STRING_TO_SEND, Wrapper.wrap(STRING_TO_SEND, 120));
    }

    @Test
    void given_negative_number_return_throw(){

        NegativeNumberExeption thrown = assertThrows( NegativeNumberExeption.class, () ->
                Wrapper.wrap(STRING_TO_SEND, -10));

        assertTrue(thrown.getMessage().contentEquals("Negatives numbers not allowed"));
    }

    @Test
    void given_longest_text_string_than_column_number_return_text_string_with_corrects_breaks_lines() throws NegativeNumberExeption {

        assertEquals(CORRECT_RESPONSE_WITH_10, Wrapper.wrap(STRING_TO_SEND, 10));
    }

}