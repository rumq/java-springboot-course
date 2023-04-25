package com.example.restaurantbean.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("restaurantService")
public class RestaurantServiceImpl  implements RestaurantService{

    @Autowired
    private RestaurantRepository repository;

    @Override
    public void showDish( String name, int price){
        System.out.printf("Menu item ", name, price);
        repository.update(name, price);
    }
}
