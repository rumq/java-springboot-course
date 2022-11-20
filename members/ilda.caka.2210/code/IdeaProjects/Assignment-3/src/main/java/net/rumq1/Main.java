package net.rumq1;

import net.rumq.Component;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(net.rumq1.Main.class, args);
        Component1 bean = ctx.getBean(Component1.class);

        System.out.println(bean);
    }
}


