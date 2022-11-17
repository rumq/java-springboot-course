package demo.beans.scanning;

import demo.beans.MyComponent;
import demo.beans.package1.ComponentA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages={"demo.beans.package1"})
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        ComponentA componentA = ctx.getBean(ComponentA.class);

        System.out.println(componentA);

    }

}
