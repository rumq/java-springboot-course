package net.rumq.assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {

		SpringApplication.run(Assignment1Application.class, args);
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		ctx.register(Singleton.class);
		ctx.refresh();

		ScopedClass s1=ctx.getBean(ScopedClass.class);
		System.out.println(s1);

		ScopedClass s2=ctx.getBean(ScopedClass.class);
		System.out.println(s2);
	}

}
