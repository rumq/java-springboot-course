package net.rumq.restaurantdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestaurantDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(RestaurantDiApplication.class, args);
        RestaurantService restaurantService = ctx.getBean(RestaurantService.class);
        restaurantService.service("Menu","Staff");

    }

}
