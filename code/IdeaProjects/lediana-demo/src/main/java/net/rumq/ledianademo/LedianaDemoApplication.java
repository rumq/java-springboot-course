package net.rumq.ledianademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LedianaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LedianaDemoApplication.class, args);
        System.out.println("Hello Lediana");
    }

}
