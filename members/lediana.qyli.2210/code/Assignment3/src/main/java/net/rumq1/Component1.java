package net.rumq1;
@org.springframework.stereotype.Component
public class Component1 {
    public Component1() {
        System.out.println("MyComponent1 bean created");
    }

    @Override
    public String toString() {
        return "Hi from MyComponent1 bean";
    }
}
