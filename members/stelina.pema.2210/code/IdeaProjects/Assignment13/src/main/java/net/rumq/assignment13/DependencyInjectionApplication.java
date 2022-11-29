package net.rumq.assignment13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        RestaurantService service = ctx.getBean(RestaurantService.class);
        service.serve_menu();
        service.take_order("Imam Bayaldi");
        service.serve_order();
        service.billing(true);
    }

}
