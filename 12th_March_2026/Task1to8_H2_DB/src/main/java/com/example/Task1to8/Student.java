package com.example.Task1to8;

import jakarta.persistence.*;
import org.jspecify.annotations.NonNull;

@Entity(name = "student_data")
//@Table(name = "student_data")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name", nullable = false)
    private String name;

    @Column(name = "student_age", nullable = false)
    private int age;

    @Column(name = "student_email", nullable = false, unique = true)
    private String emailId;

    public Student(Long id, String name, int age, String emailId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public Student() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}

