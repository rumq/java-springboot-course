package net.rumq.sb.demo02basics;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
 
    public MyComponent() {
        System.out.println("MyComponent created");
    }

    @Override
    public String toString() {
        
        return "Hello from MyComponent";
    }

}
