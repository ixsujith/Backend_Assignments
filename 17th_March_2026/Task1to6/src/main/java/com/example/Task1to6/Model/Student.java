package com.example.Task1to6.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "Student_name")
    private String name;

    @NotNull
    @Column(name = "Student_age")
    private int age;

    @Email
    @Column(name = "Student_email", unique = true)
    private String emailId;



    public Student(Long id, String name, int age, String emailId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public Student() {}

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
