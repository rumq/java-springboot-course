package demo.beans.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        MySingletonComponent ref1 = ctx.getBean(MySingletonComponent.class);
        MySingletonComponent ref2 = ctx.getBean(MySingletonComponent.class);
        MySingletonComponent ref3 = ctx.getBean(MySingletonComponent.class);

        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);
    }

}