package demo.pvdemo06configurationclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Game {

    
    private Circle circle;
    
    // Autowired using the default bean
    public Game(Circle circle) {
        this.circle = circle;
    }

    @Override
    public String toString() {
        return "Game [circle=" + circle + "]";
    }
    
}
