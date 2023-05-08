package demo.pvdemo06configurationclasses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CircleConfigurator {

    @Bean
    @Primary // this is the default bean
    public Circle redCircle() {
        return new Circle("red");
    }
    
}
