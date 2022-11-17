package net.rumq.application;

import net.rumq.Component1;
import net.rumq2.Component2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(App.class, args);

        Component1 bean1 = ctx.getBean(Component1.class);
        Component2 bean2 = ctx.getBean(Component2.class);
        System.out.println(bean1);
    }

}
