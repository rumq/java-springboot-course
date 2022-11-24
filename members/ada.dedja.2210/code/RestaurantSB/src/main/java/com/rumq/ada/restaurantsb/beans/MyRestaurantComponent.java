package com.rumq.ada.restaurantsb.beans;

import org.springframework.stereotype.Component;

@Component
public class MyRestaurantComponent {

    public MyRestaurantComponent(){
        System.out.println("This is my restaurant");
    }

    @Override
    public String toString() {
        return "This is the newest restaurant in the city";
    }
}
