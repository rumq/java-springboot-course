package demo.beans.demo04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo04Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Demo04Application.class, args);

        MyComponent bean = ctx.getBean(MyComponent.class);

        System.out.println(bean);

    }

}
