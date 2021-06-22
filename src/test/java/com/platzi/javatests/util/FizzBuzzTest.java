package com.platzi.javatests.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void number_is_divisible_by_3() {
       FizzBuzz fizzBuzz = new FizzBuzz();

      assertThat(fizzBuzz.pruebaFizzBuzz(3),is("Fizz"));
        assertThat(fizzBuzz.pruebaFizzBuzz(6),is("Fizz"));

    }

    @Test
    public void number_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.pruebaFizzBuzz(5),is("Buzz"));
        assertThat(fizzBuzz.pruebaFizzBuzz(10),is("Buzz"));


    }

    @Test
    public void number_is_divisible_by_5_and_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

       assertThat(fizzBuzz.pruebaFizzBuzz(15),is("FizzBuzz"));
       assertThat(fizzBuzz.pruebaFizzBuzz(30),is("FizzBuzz"));
    }
}