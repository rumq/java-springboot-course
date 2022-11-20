package net.rumq.assignment1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class Singleton {
    @Bean
    @Scope(value = "singleton") //to run project in prototype scope change value="prototype"
    public ScopedClass scopedclass() {
        return new ScopedClass();
    }
}


