package demo.pvdemo04beansdependencyinjection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	private static final String RED = "Red";
	private static final String BLUE = "Blue";
	private static final String TRIANGLE = "Triangle";
	private static final String SQUARE = "Square";

	@Autowired
	ShapeService shapeService;

	@Test
	void dependencyTest() {
		var result = shapeService.draw();
		assertEquals(String.format("Drawing %s with %s Ink", TRIANGLE, RED), result);
		System.out.println(result);
	}

}
