package org.wordwrap;

import org.junit.jupiter.api.Test;

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
     *         de columna.
     *
     *       - Si el número de columna introducido es menor que 0.
     *
     *       - Si una palabra tiene una longitud mayor que el número de
     *         columna realizar un salto de línea.
     *
     *       - Si se introduce una cadena y número de columna correcto
     *         devolver el resultado esperado.
     */

    private static final String STRING_TO_SEND = "Nuevo test de la kata Wrapper 3.0 con gradle y helicoptero";

}