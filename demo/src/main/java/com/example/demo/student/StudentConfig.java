package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student milad = new Student(
                    1L,
                    "Milad",
                    "Miladkhadem@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 5)
            );
            Student sam = new Student(
                    2L,
                    "Sam",
                    "sam@gmail.com",
                    LocalDate.of(1995, Month.DECEMBER, 5)
            );
            repository.saveAll(
                    List.of(milad, sam)
            );
        };
    }
}
