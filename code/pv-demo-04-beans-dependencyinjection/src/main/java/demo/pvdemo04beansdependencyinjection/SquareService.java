package demo.pvdemo04beansdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component
public class SquareService implements ShapeService {


    @Autowired
    InkRepository inkRepository;

    @Override
    public String draw() {
        return "Drawing Square with " + inkRepository.getMaterial();
    }
    
}
