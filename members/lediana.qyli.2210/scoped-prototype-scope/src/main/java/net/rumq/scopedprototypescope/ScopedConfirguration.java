package net.rumq.scopedprototypescope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopedConfirguration {
    @Bean
    @Scope(value="singleton")
    public ScopedClass scopedclass(){
        return  new ScopedClass();
    }
}
