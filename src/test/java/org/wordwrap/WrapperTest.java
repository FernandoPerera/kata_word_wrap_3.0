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

    @Test
    void given_empty_string_return_zero(){

        assertEquals("0", Wrapper.wrap("", 0));
    }

    @Test
    void given_null_value_return_zero(){

        assertEquals("0", Wrapper.wrap(null, 0));
    }

    @Test
    void given_shorter_length_of_text_string_than_column_number_return_same_text_string(){

        assertEquals(STRING_TO_SEND, Wrapper.wrap(STRING_TO_SEND, 120));
    }

    @Test
    void given_negative_number_return_throw(){

        NegativeNumberExeption thrown = assertThrows( NegativeNumberExeption.class, () ->
                Wrapper.wrap(STRING_TO_SEND, -10));

        assertTrue(thrown.getMessage().contentEquals("Negatives numbers not allowed"));

    }

}