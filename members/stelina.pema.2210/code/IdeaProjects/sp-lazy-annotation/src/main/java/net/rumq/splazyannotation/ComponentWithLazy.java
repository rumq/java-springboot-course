package net.rumq.splazyannotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ComponentWithLazy {

    public ComponentWithLazy() {
        System.out.println("MyComponentWithLazy bean created");
    }

    @Override
    public String toString() {
        return "Hi from MyComponentWithLazy bean";
    }

}