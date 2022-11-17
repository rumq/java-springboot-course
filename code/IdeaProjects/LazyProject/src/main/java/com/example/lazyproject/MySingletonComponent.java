package com.example.lazyproject;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy

public class MySingletonComponent {
   public MySingletonComponent(){System.out.println("MySingleTon lazy bean created");}

   @Override
   public String toString() {
      return "Hi from MySingletonComponent lazy bean";
   }

}
