package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public static boolean esDiviPorTres(int num){
        return num%3==0;
    }

    public static boolean esDiviPorCinco(int num){
        return num%5==0;
    }

    public String ImprimeFizzBuzz(int num) {
        if(esDiviPorTres(num)&&esDiviPorCinco(num)) {
            return "FizzBuzz";
        }if (esDiviPorTres(num)) {
            return "Fizz";
        }if (esDiviPorCinco(num)){
            return "Buzz";
        }else {
            return String.valueOf(num);
        }
    }


    public List<String> JuegoFizzBuzz(int inicio, int valorfinal) {
        List<String> lista = new ArrayList<>();
        for (int i = inicio; i <=valorfinal ; i++) {
            lista.add(ImprimeFizzBuzz(i));
        }
        return lista;
    }
}
