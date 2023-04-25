package com.example.restaurantbean.di;

import org.springframework.stereotype.Repository;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository{

    @Override
    public void update(String name, int price){
        System.out.printf("Menu Item ", name, price);
    }
}
