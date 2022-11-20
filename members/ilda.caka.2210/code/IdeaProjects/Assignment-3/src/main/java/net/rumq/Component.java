package net.rumq;

@org.springframework.stereotype.Component
public class Component {
    public Component() {
        System.out.println("MyComponent bean created");
    }

    @Override
    public String toString() {
        return "Hi from MyComponent bean";
    }
}
