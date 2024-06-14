package org.example;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ian
 * @version 1
 * Clase TDD de FizzBuzz
 *
 */
/*
Implementa el juego FizzBuzz. Para números del 1 al 100, imprime "Fizz" si el número es divisible por 3,
 "Buzz" si es divisible por 5, y "FizzBuzz" si es divisible por ambos.
 */
class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    /**
     *Primera prueba para verificar la funcion esDiviPorTres para luego crearla
     */
    @Test
    public void esDivisible() {
    assertTrue(fizzBuzz.esDiviPorTres(3),"El numero es divisible por 3");
    }

    /**
     * Segunda prueba se implementa metodo para hacer funcionar la prueba
     */
    @Test
    public void esDiviPorTres(){
        assertTrue(fizzBuzz.esDiviPorTres(3),"el numero es divisible por 3");
    }

    /**
     * Tercera prueba probaremos si no es divisible por 4
     */
    @Test
    public void esDivisiblePorCuatro(){
        boolean respuesta = fizzBuzz.esDiviPorTres(4);
        assertEquals(false,respuesta);

    }


}