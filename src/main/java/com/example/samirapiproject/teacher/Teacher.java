package com.example.samirapiproject.teacher;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // this is for hibernate to map the teacher class to a table in the DB
public class Teacher {
    @Id
    @SequenceGenerator(
            name= "Teacher_sequence",
            sequenceName= "Teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue ( strategy = GenerationType.SEQUENCE,
            generator = "Teacher_sequence")
    private Long id;
    private  String name;
    private Integer age;
    private LocalDate dob;
    private String email;

    public Teacher() {
    }

    public Teacher(Long id,
                   String name,
                   Integer age,
                   LocalDate dob,
                   String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public Teacher(String name,
                   Integer age,
                   LocalDate dob,
                   String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }

}
