package net.rumq.iclazyannotation;

import org.springframework.stereotype.Component;

@Component
public class ComponentWithoutLazy {

    public ComponentWithoutLazy() {

        System.out.println("Component bean created");
    }

    @Override
    public String toString() {

        return "Hi from Component bean";
    }
}