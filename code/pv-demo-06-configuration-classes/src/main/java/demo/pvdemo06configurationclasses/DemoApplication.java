package demo.pvdemo06configurationclasses;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		// 01 Configured in CircleConfigurator
		Circle rc = ctx.getBean("redCircle", Circle.class);
		System.out.println("01 rc: " + rc);

		// 02 Autowired in Game as usual
		Game game = ctx.getBean(Game.class);
		System.out.println("02 game: " + game);

		// 03 Configured in Application class
		Circle gc = ctx.getBean("greenCircle", Circle.class);
		System.out.println("03 gc: " + gc);

		// 04A Can give fancy names to beans
		Circle aqua = ctx.getBean("aquamarineCircle", Circle.class);
		System.out.println("04A aqua: " + aqua);

		// 04B Can give fancy names to beans (more than one)
		Circle azure = ctx.getBean("azureCircle", Circle.class);
		System.out.println("04B azure: " + azure);

		// 05A Dependency configured by calling a bean method
		Cylinder blueCylinder = ctx.getBean("blueCylinder", Cylinder.class);
		System.out.println("05C blueCylinder: " + blueCylinder);

		// 05B Dependency configured by passing as constructor argument
		Cylinder redCylinder = ctx.getBean("redCylinder", Cylinder.class);
		System.out.println("05A redCylinder: " + redCylinder);

		// 05C Dependency configured by passing as constructor argument using @Qualifier
		Cylinder greenCylinder = ctx.getBean("greenCylinder", Cylinder.class);
		System.out.println("05B greenCylinder: " + greenCylinder);


	}

	// can configure beans in the Application class
	@Bean
	Circle greenCircle() {
		return new Circle("green");
	}

	// give one or more names to a bean
	@Bean(name = { "aquamarineCircle", "azureCircle", "TurquoiseCircle" })
	Circle blueCircle() {
		return new Circle("blue");
	}

	// Configure dependency technique 1 : call a bean method
	@Bean
	Cylinder blueCylinder() {
		return new Cylinder(blueCircle());
	}

	// Configure dependency technique 2 : pass as constructor argument
	@Bean
	Cylinder redCylinder(Circle circle) {
		return new Cylinder(circle);
	}
	
	// Configure dependency technique 2 : Can use @Qualifier
	@Bean
	Cylinder greenCylinder(@Qualifier("greenCircle") Circle circle) {
		return new Cylinder(circle);
	}


}
