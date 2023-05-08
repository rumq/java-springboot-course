package demo.pvdemo04beansdependencyinjection;

import org.springframework.stereotype.Component;

// @Component
public class BlueInkRepository implements InkRepository{

    @Override
    public String getMaterial() {
        return "Blue Ink";
    }
    
}
