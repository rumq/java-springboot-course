package demo.pvdemo04beansdependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class TriangleRepository implements ShapeRepository{

    @Override
    public String getMaterial() {
        return "Triangle Ink";
    }
    
}
