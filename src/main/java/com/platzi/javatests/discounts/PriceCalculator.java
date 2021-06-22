package com.platzi.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount;

    public Object getTotal() {

    double result = 0;
    for(Double price : prices){
        result += price;
    }
        return  result * ((discount-100)/100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {


        this.discount = discount;
    }
}
