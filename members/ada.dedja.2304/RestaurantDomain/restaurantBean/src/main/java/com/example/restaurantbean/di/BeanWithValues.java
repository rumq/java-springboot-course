package com.example.restaurantbean.di;

import org.springframework.beans.factory.annotation.Value;

public class BeanWithValues {
    @Value("${name}")
    private String name;

    @Value("${price}")
    private double price;

    @Override
    public String toString(){
        return String.format("Main dish name %s, price %.2f", name, price);
    }
}
