package net.rumq.lqlazyannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LqLazyAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(LqLazyAnnotationApplication.class, args);

//		ComponentWithoutLazy bean = ctx.getBean(ComponentWithoutLazy.class);
//		System.out.println(bean);
        ComponentWithLazy bean = ctx.getBean(ComponentWithLazy.class);
        System.out.println(bean);
    }

}