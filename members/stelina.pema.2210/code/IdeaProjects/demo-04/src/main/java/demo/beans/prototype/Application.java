package demo.beans.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        MyPrototypeComponent ref1 = ctx.getBean(MyPrototypeComponent.class);
        MyPrototypeComponent ref2 = ctx.getBean(MyPrototypeComponent.class);
        MyPrototypeComponent ref3 = ctx.getBean(MyPrototypeComponent.class);

        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);
    }

}
