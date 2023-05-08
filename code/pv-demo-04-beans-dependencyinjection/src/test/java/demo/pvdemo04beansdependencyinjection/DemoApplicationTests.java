package demo.pvdemo04beansdependencyinjection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	ShapeService shapeService;

	
	
	/**
	 * This test is disabled because Square service & repository are commented out/
	 * We can have only one implementation of ShapeRepository & ShapeService
	 */
	@Test
	@Disabled 
	void SquareTest() {

		var result = shapeService.draw();
		assertEquals("Drawing Square with Square Ink", result);
		System.out.println(result);
	}

	@Test	
	void TriangleTest() {

		var result = shapeService.draw();
		assertEquals("Drawing Triangle with Triangle Ink", result);
		System.out.println(result);
	}

}
