package demo.pvdemo05injectiontechniques;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *  This application is used to demonstrate how to access command line arguments
 *  passed to the application.
 * 
 *  You can see the options and non-option arguments in the console output.
 * 
 *  Run it with the following command:
 *  cd ~/git/java-springboot-course/code/pv-demo-05-injection-techniques
 *  mvn spring-boot:run -Dspring-boot.run.arguments="--target=first --target=second third"
 * 
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(DemoApplication.class, args);

		// 10 Process arguments
		System.out.println("**********************\n10 Arguments : ");
		var processArguments = ctx.getBean("processArguments", ProcessArguments.class);
		System.out.println("processArguments : " + processArguments);
	}

}
