package net.rumq.splazyannotation;

import org.springframework.stereotype.Component;

@Component
public class ComponentWithoutLazy {

    public ComponentWithoutLazy() {
        System.out.println("MyComponentWithoutLazy bean created");
    }

    @Override
    public String toString() {
        return "Hi from MyComponentWithoutLazy bean";
    }

}