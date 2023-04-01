package com.example.amigostutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner comamandLinerRunner(StudentRepository repository) {
        return args -> {
            Student stelina = new Student(
                    1L,
                    "Stelina",
                    "stelina.pema@something.com",
                    LocalDate.of(2000, Month.MARCH, 16)
            );

            Student sahil = new Student(
                    2L,
                    "Sahil",
                    "sahil@something.com",
                    LocalDate.of(2005, Month.AUGUST, 1)

            );

            repository.saveAll(
                    List.of(stelina, sahil)
            );

        };
    }

}