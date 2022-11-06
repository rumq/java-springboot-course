package demo.beans.lazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        // Uncomment this code to see that the bean
        // is created only when accessed
//        MyComponent bean = ctx.getBean(MyComponent.class);

    }

}
