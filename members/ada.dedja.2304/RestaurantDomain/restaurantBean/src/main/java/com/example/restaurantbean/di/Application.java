package com.example.restaurantbean.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        RestaurantService restaurantService = ctx.getBean(RestaurantService.class);
        restaurantService.showDish("Burger", 24);

        BeanWithValues beanWithValues = ctx.getBean(BeanWithValues.class);
        System.out.println(beanWithValues);
    }
}
