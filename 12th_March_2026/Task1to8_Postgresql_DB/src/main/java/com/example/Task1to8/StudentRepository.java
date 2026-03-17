package com.example.Task1to8;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
    List<Student> findByName(String name);

    List<Student> findAllByAge(int age);

    int countByName(String name);

    int countByAge(int age);

    List<Student> findByAge(int age);

    @Query("select s from Student s where s.age > :age")
    List<Student> findByQueryAge(@Param("age") int age);
}
