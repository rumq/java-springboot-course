package com.example.lazyproject;

import org.springframework.stereotype.Component;

@Component
public class MySingletonComponentNonLazy {
    public MySingletonComponentNonLazy(){System.out.println("MySingleTon bean created");}

    @Override
    public String toString() {
        return "Hi from MySingletonComponent bean";
    }

}
