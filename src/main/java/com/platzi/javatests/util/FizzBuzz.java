package com.platzi.javatests.util;

public class FizzBuzz {

String result = "";

    public static String pruebaFizzBuzz(int NumReturn) {
        if (NumReturn % 3 == 0) {
            return "Fizz";
        }

        if (NumReturn % 5 == 0) {
           return "Buzz";
        }

        if (NumReturn % 5 == 0 || NumReturn % 3 == 0) {
           return "FizzBuzz";
        }
        return String.valueOf(NumReturn);
    }


}
