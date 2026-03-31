package com.example.Task1to7.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "Student_name")
    private String name;

    @NotNull
    @Min(10)
    @Column(name = "Student_age")
    private int age;

    @NotNull
    @Column(name = "Student_email", unique = true)
    private String emailId;

    public Student(Long id, String name, int age, String emailId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public Student() {}

}
