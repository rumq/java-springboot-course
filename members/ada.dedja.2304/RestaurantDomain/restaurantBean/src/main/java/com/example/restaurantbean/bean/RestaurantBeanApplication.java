package com.example.restaurantbean.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestaurantBeanApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(RestaurantBeanApplication.class, args);

        MyComponent bean = ctx.getBean(MyComponent.class);
        System.out.println(bean);
    }
}
