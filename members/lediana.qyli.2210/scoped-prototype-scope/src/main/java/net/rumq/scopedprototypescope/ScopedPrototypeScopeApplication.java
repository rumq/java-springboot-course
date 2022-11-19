package net.rumq.scopedprototypescope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ScopedPrototypeScopeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ScopedPrototypeScopeApplication.class, args);

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		ctx.register(ScopedConfirguration.class);
		ctx.refresh();

		ScopedClass s1=ctx.getBean(ScopedClass.class);
		System.out.println(s1);
	}

}
