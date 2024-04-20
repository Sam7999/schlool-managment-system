package com.example.samirapiproject.teacher;

import com.example.samirapiproject.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration // this will be a config file
public class TeacherConfig {  // we want to have a bean "CommandLineRunner"

    @Bean
    CommandLineRunner commandLineRunner2 (TeacherRepository teacherRepository){ // we are going to inject TeacherRepository inside () and we name it teacherRepository  to have access to our Repo
        return args -> {
            Teacher adam = new Teacher (

                    "Adam",
                    57,
                    LocalDate.of(1970, Month.APRIL, 12),
                    "adam.mada@gmail.com"

            );
            Teacher joseph = new Teacher(
                    "Joseph",
                    67,
                    LocalDate.of(1965,Month.NOVEMBER, 26),
                    "Joe.eph@gmail.com"
            );
            Teacher douglas = new Teacher(
                    "Douglas",
                    33,
                    LocalDate.of(1990,Month.JUNE, 30),
                    "doglace.costa@gmail.com"
            );
            teacherRepository.saveAll(List.of(adam,joseph,douglas) // we want to save these teachers in our DB, so we invoke our repository and we call the saveAll method

            );
        };
    }
}
