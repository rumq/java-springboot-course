package com.rumq.ada.restaurantsb.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestaurantSbApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(RestaurantSbApplication.class, args);

        MyRestaurantComponent restaurant = ctx.getBean(MyRestaurantComponent.class);
        System.out.println(restaurant);
    }

}
