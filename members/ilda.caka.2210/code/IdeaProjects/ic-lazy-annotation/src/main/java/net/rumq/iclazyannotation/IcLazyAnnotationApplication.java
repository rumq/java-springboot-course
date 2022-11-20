package net.rumq.iclazyannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IcLazyAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(IcLazyAnnotationApplication.class, args);
//		SpringApplication.run(IcLazyAnnotationApplication.class, args);
		ComponentWithoutLazy bean = ctx.getBean(ComponentWithoutLazy.class);
		ComponentWithLazy bean1 = ctx.getBean(ComponentWithLazy.class);

		System.out.println(bean);
	}
}
