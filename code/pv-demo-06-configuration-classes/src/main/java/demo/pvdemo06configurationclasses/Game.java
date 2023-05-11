package demo.pvdemo06configurationclasses;

import org.springframework.stereotype.Component;

/**
 *  Some game that needs a circle
 * 
 */
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
