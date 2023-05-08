package demo.pvdemo04beansdependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class RedInkRepository implements InkRepository{

    @Override
    public String getMaterial() {
        return "Red Ink";
    }
    
}
