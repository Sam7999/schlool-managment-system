package com.example.samirapiproject.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // this is responsible for data access
public interface TeacherRepository
        extends JpaRepository<Teacher, Long> {  // we have to specify T,ID the type and the ID type
                                                         // JpaRepository is an interface that has all the methods available to us without using sql queries or code we can fetch Teacher from db
}
