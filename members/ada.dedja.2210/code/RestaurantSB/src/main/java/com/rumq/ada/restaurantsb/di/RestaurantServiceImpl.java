package com.rumq.ada.restaurantsb.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository repository;

    @Override
    public void restaurantName(String name) {
        System.out.printf("The new restaurant is named " + name + "\n");
        repository.showName(name);
    }

    @Override
    public void details(String name, String address) {
        System.out.printf("Please find below the details for this restaurant " + name + "," + address + "\n");
        repository.show(name, address);

    }
}
