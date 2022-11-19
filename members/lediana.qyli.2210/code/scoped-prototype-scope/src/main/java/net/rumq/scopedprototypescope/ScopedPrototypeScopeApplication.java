package net.rumq.scopedprototypescope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class ScopedPrototypeScopeApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		ctx.register(ScopedConfirguration.class);
		ctx.refresh();

		ScopedClass s1=ctx.getBean(ScopedClass.class);
		System.out.println(s1);

		ScopedClass s2=ctx.getBean(ScopedClass.class);
		System.out.println(s2);

//		Result :
//		@Scope(value="singleton")
//		only one instance of the spring bean will
//		be created for the spring container (default spring).
//		@Scope(value="prototype")
//		A new instance will be created every time the
//		bean is requested from the spring container.



	}

}
