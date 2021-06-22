package com.platzi.javatests.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorTest {

    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator calculator = new PriceCalculator();
        assertThat(calculator.getTotal(),is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(10.0);
        calculator.addPrice(5.1);
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();

    calculator.addPrice(12.0);
        calculator.addPrice(17.5);
        calculator.addPrice(500.0);
        calculator.addPrice(250.0);

        calculator.setDiscount(50);

        assertThat(calculator.getTotal(),is(30.0));

    }
}