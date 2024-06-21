package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;
import java.util.Locale;

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

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    /**
     *Primera prueba para verificar la funcion esDiviPorTres para luego crearla.
     * Se crea el metodo en FizzBuzz que retorne true
     */
    @Test
    public void esDivisible() {
    assertTrue(fizzBuzz.esDiviPorTres(3),"El numero es divisible por 3");
    }

    /**
     * Segunda prueba se implementa metodo para hacer funcionar la prueba.
     * Se agrega la variable de num para ingresar el numero para luego ser %3 si el resultado es
     * 0 es divisible y retorna true
     */
    @Test
    public void esDiviPorTres(){
        assertTrue(fizzBuzz.esDiviPorTres(3),"el numero es divisible por 3");
    }

    /**
     * Tercera prueba probaremos si no es divisible por 4s
     * Comprobamos que retorne falso si num es = 4
     */
    @Test
    public void esDivisiblePorCuatro(){
        boolean respuesta = fizzBuzz.esDiviPorTres(4);
        assertEquals(false,respuesta);

    }
    /**
     * Cuarta prueba para testear el metodo despues de su refactorizacion.
     * Se refactoriza y probamos que de verdadero.
     */
    @Test
    public void esDivisibleRefactor(){
        boolean respuesta = fizzBuzz.esDiviPorTres(17);
        boolean respuesta2 = fizzBuzz.esDiviPorTres(4);
        assertEquals(false,respuesta);
        assertNotEquals(true,respuesta2);
    }
    /**
     * Primera prueba para verificar la funcion esDivisiblePor5 (return true)
     *
     */
    @Test
    public void esDivisible2(){
       assertTrue(fizzBuzz.esDiviPorCinco(5),"Es divisible por 5");
    }

    /**
     * Se agrega la variable , en caso que num%5=0 retorne true
     */
    @Test
    public void esDivisiblePorCinco(){
        assertTrue(fizzBuzz.esDiviPorCinco(5),"Es divisible por 5");
    }

    /**
     * Comprobaremos si es que retorna false cuando es divide por otro numero que no sea multiplo de 5
     */
    @Test
    public void esDivisiblePorOtro(){
        boolean respuesta = fizzBuzz.esDiviPorCinco(17);
        assertEquals(false,respuesta);
    }

    /**
     * Refactorizamos el metodo y comprobamos su funcionamiento
     * @param number es el numero que ingresamos para testear
     * @param expected es lo que esperaremos de la prueba
     */
    @ParameterizedTest
    @CsvSource({
            "17, false",
            "25, true",
            "15, true",
            "9, false"
    })
    public void esDivisibleRefactor2(int number, boolean expected){
        boolean resultado = fizzBuzz.esDiviPorCinco(number);
        assertEquals(expected, resultado);
    }

    /**
     * Creamos la prueba para crear el metodo de imprimir FizzBuzz
     */
    @Test
    public void ImprimeFizz(){
        assertEquals("Fizz",fizzBuzz.ImprimeFizzBuzz(3));
    }
    /**
     * Ahora probaremos si imprime Buzz
     */
    @Test
    public void ImprimeBuzz(){
        assertEquals("Buzz",fizzBuzz.ImprimeFizzBuzz(5));
    }
    /**
     * Ahora probaremos si imprime FizzBuzz
     */
    @Test
    public void ImprimeFizzBuzz(){
        assertEquals("FizzBuzz",fizzBuzz.ImprimeFizzBuzz(15));
    }
    /**
     * No es FizzBuzz Ni Fizz NI Buzz caso 1 y 2 retorne nada
     * @param number es el numero que se ingresa
     * @param expected es el numero que se espera
     */
    @ParameterizedTest
    @CsvSource({
            " 2,2",
            "1,1"
    })
    public void NOImprimeFizzBuzz(int number, String expected){
        String resultado = fizzBuzz.ImprimeFizzBuzz(number);
        assertEquals(expected, resultado);

    }

    /**
     * Prueba unitaria para probar todo el funcionamiento
     *
     */
    @Test
    public void TestPruebaDelJuego(){
        List<String> resultados = fizzBuzz.JuegoFizzBuzz(1, 15);
        String[] esperado = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"};
        assertArrayEquals(esperado,resultados.toArray());

    }
}