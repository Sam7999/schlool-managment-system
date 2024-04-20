package com.example.samirapiproject.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {

// findStudentByEmail will transform to an SQL: SELECT * FROM student WHERE email = ?
  //  @Query ("SELECT s FROM Student s Where s.email=?1")  this is JBQL and not sql, and the "Student" is the student class, it let us access all the properties of the class
    Optional<Student>findStudentByEmail(String email);
}
