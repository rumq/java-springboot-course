package com.example.lazyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LazyProjectApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(LazyProjectApplication.class, args);

        MySingletonComponent ref = ctx.getBean(MySingletonComponent.class);
        System.out.println(ref);

        MySingletonComponentNonLazy ref1 = ctx.getBean(MySingletonComponentNonLazy.class);
        System.out.println(ref1);
    }

}
