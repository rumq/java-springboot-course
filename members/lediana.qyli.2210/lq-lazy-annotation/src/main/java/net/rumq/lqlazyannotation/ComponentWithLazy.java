package net.rumq.lqlazyannotation;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ComponentWithLazy {

    public ComponentWithLazy() {
        System.out.println("MyComponent with lazy annotation bean created");
    }

    @Override
    public String toString() {
        return "Hi from MyComponent with lazy annotation bean";
    }
}