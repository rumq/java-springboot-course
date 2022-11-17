package net.rumq;

import org.springframework.stereotype.Component;

@Component
public class Component1 {

    public Component1() {
        System.out.println("MyComponent bean created");
    }

    @Override
    public String toString() {
        return "Hi from MyComponent bean";
    }
}