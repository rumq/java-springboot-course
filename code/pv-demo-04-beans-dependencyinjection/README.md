>[Home](Home.md)

#  04 Spring Boot Beans and Dependency Injection

- See also [demo-04-beans-dependencyinjection](https://github.com/rumq/spring-boot-in-3-weeks/tree/master/demos/demo-04-beans-dependencyinjection).

This application demonstrates dependency injection in Spring Boot.

The `DemoApplication` gets the bean for `ShapeService` and calls the method `draw()` on it.
It returns the text "Drawing Triangle with Red Ink".

The `TriangleService` & `SquareService` implement the `ShapeService` service interface.
The `RedInkRepository` & `BlueInkRepository`  implement the `InkRepository` repository interface.

However, only one implementation of each interface is annotated with `@Component`.
SpringBoot will instantiate the bean for `TriangleService` as there is only one implementation that is a `@Component`.
It in turn has a dependency on `inkRepository`, so this bean is also instantiated, and again only one implementation exists.

You can notice that the DemoApplication is not aware of the implementation of the `ShapeService` interface.
That is, it is decoupled from the implementation.

Similarly `ShapeService` is not aware of the implementation of the `InkRepository` interface.

You can change the shape from Triangle to Square by uncommenting the `@Component` annotation on the `SquareService` class, and commenting the `@Component` annotation on the `TriangleService` class.

Similarly you can change the ink from Red to Blue by uncommenting the `@Component` annotation on the `BlueInkRepository` class, and commenting the `@Component` annotation on the `RedInkRepository` class.

You can run the tests to see the output.

```sh
# Run the application
cd ~/git/java-springboot-course/code/pv-demo-04-beans-dependencyinjection
mvn spring-boot:run

# Run the tests
cd ~/git/java-springboot-course/code/pv-demo-04-beans-dependencyinjection
mvn test
```


>[Home](HOME.md)
