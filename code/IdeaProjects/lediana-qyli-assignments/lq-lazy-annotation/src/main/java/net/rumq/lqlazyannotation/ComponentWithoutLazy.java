package net.rumq.lqlazyannotation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

@Component
public class ComponentWithoutLazy {

    public ComponentWithoutLazy() {
        System.out.println("MyComponent bean created");
    }

    @Override
   public String toString() {
       return "Hi from MyComponent bean";
    }
}