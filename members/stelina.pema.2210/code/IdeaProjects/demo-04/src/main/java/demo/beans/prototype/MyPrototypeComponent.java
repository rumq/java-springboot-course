package demo.beans.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyPrototypeComponent {
    public MyPrototypeComponent(){
        System.out.println("MyPrototypeComponent bean created");
    }

    @Override
    public String toString() {
        return "Hi from MyPrototypeComponent";
    }
}
