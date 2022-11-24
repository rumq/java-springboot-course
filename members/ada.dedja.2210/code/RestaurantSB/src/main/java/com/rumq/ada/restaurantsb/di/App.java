package com.rumq.ada.restaurantsb.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);

        RestaurantService restaurantService = ctx.getBean(RestaurantService.class);
        restaurantService.restaurantName("Restaurant Artigiano");
        restaurantService.details("Restaurant Artigiano", " Blloku, Tirana");
    }
}
