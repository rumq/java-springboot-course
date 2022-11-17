package demo.beans.singleton;

import org.springframework.stereotype.Component;

@Component
public class MySingletonComponent {
    public MySingletonComponent(){
        System.out.println("MySingletonComponent bean created");
    }

    @Override
    public String toString() {
        return "Hi from MySingletonComponent";
    }
}
