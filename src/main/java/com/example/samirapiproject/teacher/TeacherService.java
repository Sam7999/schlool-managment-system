package com.example.samirapiproject.teacher;
import com.example.samirapiproject.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service // this is a @component which means it's a bean that can be injected in the controller
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    public List<Teacher> getTeacher(){
        return teacherRepository.findAll();   //we have a bunch of methods that we haven't implemented, and this is the magic of Spring Data JPA
                                        // findAll to return a list to us
    }


    public void addNewTeacher(Teacher teacher) {
        System.out.println(teacher);

    }
}
