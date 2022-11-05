package demo.beans.demo04;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public MyComponent(){
        System.out.println("MyComponent bean created");

    }

    @Override
    public String toString() {
        return "Hi from MyComponent";
    }
}
