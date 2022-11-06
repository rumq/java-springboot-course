package demo.di.field;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyComponent {
    public MyComponent(){
        System.out.println("MyComponent bean created");

    }

    @Override
    public String toString() {
        return "Hi from MyComponent";
    }
}
