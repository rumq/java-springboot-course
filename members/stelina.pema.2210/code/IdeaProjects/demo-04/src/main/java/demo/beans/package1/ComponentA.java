package demo.beans.package1;

import org.springframework.stereotype.Component;

@Component
public class ComponentA {
    public ComponentA(){
        System.out.println("ComponentA bean created");
    }

    @Override
    public String toString() {
        return "Hi from ComponentA";
    }
}
