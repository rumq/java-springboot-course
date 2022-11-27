package com.rumq.ada.restaurantsb.di;

import org.springframework.stereotype.Repository;

@Repository
public class RestauranRepositoryImpl implements RestaurantRepository {

    @Override
    public void show(String name, String address){
        System.out.println("We welcome you at " + name + address + "\n");
    }
    @Override
    public void showName(String name){
        System.out.printf("We are " + name + "\n");
    }
}
