package com.example.samirapiproject.student;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController // this indicates that the class is a controller, and that all the methods in the marked class will return a JSON response
@RequestMapping(path ="api/v1/student" )

public class StudentController {
    private final StudentService studentService;

    @Autowired

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping // we want te get something from our server (this is the rest endpoint we have so far )
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);

    }

    @DeleteMapping(path = "{studentId}")

    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }
    
    @PutMapping(path = "{studentId}")
    // use the setters to automatically update the entity if possible (if can or cannot change )

    public void updateStudent(
            @PathVariable("studentId") long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);
    }
}






