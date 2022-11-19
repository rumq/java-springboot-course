package net.rumq2;
@org.springframework.stereotype.Component
public class Component2 {
    public Component2() {
        System.out.println("MyComponent2 bean created");
    }

    @Override
    public String toString() {
        return "Hi from MyComponent2 bean";
    }
}
