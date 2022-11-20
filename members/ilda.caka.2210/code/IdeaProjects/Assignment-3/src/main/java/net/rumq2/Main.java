package net.rumq2;

import net.rumq1.Component1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(net.rumq2.Main.class, args);
        Component2 bean = ctx.getBean(Component2.class);

        System.out.println(bean);
    }
}
