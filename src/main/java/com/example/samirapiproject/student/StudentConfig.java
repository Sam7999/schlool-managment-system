package com.example.samirapiproject.student;

import com.example.samirapiproject.student.Student;
import com.example.samirapiproject.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Locale;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 5)
            );
            Student samir = new Student(
                   "Samir",
                   "samir7@gmail.com",
                   LocalDate.of(1993, Month.DECEMBER, 16 )
            );
            Student rayan = new Student(
                    "Rayan",
                    "rayan2007@gmail.com",
                    LocalDate.of(2007,Month.OCTOBER, 20)
            );

            Student imane = new Student(
                    "Imane",

                    "imane96@gmail.com",
                    LocalDate.of(1996, Month.APRIL,15)
            );

            Student nadia = new Student(
                    "Nadia",
                    "nadia97@mail.com",
                    LocalDate.of(2001, Month.DECEMBER, 31)
            );


            repository.saveAll(
                    List.of(mariam,alex,samir,rayan,imane,nadia)
            );

        };
    }
}
