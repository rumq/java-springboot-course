package net.rumq.iclazyannotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ComponentWithLazy {
    public ComponentWithLazy(){
        System.out.println("Lazy Component bean created");

    }
    @Override
    public String toString() {

        return "Hi from Lazy Component";
    }
}
