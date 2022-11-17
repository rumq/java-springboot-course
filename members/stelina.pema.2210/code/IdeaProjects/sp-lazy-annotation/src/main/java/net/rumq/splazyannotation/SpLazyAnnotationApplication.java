package net.rumq.splazyannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpLazyAnnotationApplication {
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpLazyAnnotationApplication.class, args);

		ComponentWithoutLazy bean = ctx.getBean(ComponentWithoutLazy.class);
		System.out.println(bean);

		ComponentWithLazy bean1 = ctx.getBean(ComponentWithLazy.class);
		System.out.println(bean1);
	}

}
