package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime1(){
        boolean result = Prime.isPrime(2);
        assertEquals(true, result);
    }

    @Test
    void isPrime2(){
        boolean result = Prime.isPrime(3);
        assertEquals(true, result);
    }

    @Test
    void isPrime3(){
        boolean result = Prime.isPrime(4);
        assertEquals(false, result);
    }

    @Test
    void isPrime4(){
        boolean result = Prime.isPrime(5);
        assertEquals(true, result);
    }

    @Test
    void isPrime5(){
        boolean result = Prime.isPrime(13);
        assertEquals(true, result);
    }

    @Test
    void isPrime6(){
        boolean result = Prime.isPrime(27);
        assertEquals(false, result);
    }

}