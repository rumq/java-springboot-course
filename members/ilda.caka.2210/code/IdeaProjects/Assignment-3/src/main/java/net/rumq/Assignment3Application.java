package net.rumq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Assignment3Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Assignment3Application.class, args);
        Component bean = ctx.getBean(Component.class);

        System.out.println(bean);
    }

}