package net.rumq2;

import org.springframework.stereotype.Component;

@Component
public class Component2 {

    public Component2() {
        System.out.println("MyComponent bean 2 created");
    }

    @Override
    public String toString() {
        return "Hi from MyComponent 2 bean";
    }
}