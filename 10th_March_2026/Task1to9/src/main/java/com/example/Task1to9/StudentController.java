package com.example.Task1to9;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students") // Task1
public class StudentController{

    public StudentController(StudentList studentList) {
        this.studentList = studentList;
    }

    private StudentList studentList;

    // Task2
    @GetMapping("/StudentList")
    public ResponseEntity<List<Student>> output() {
        return ResponseEntity.ok(studentList.students);
    }

    // Task3
    @GetMapping("/listUsingID/{id}")
    public ResponseEntity<Student> IdOutput(@PathVariable int id) {
        Student s = studentList.usingStudentID(id);

        if(s != null) {
            return ResponseEntity.ok(s);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    // Task4
    @GetMapping("/listUsingName")
    public ResponseEntity<Student> nameOutput(@RequestParam String name) {

        Student s = studentList.usingStudentName(name);

        if(s != null) {
            return ResponseEntity.ok(s);
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }

    // Task5
    @PostMapping("/newStudent")
    public ResponseEntity<String> createUser(@RequestBody Student student) {
        for(Student s : studentList.students) {
            if(s.getId() == student.getId()) {
                return ResponseEntity.badRequest().body("User already present");
            }
        }
        studentList.students.add(student);
        return ResponseEntity.ok().body("User Created");
    }

    // Task6 - for updating entire resource of a student
    @PutMapping("/updateUserPUT/{id}")
    public ResponseEntity<Student> updateUserPUT(@PathVariable int id, @RequestBody Student student) {
        for(Student s : studentList.students) {
            if(id == s.getId()) {
                s.setId(student.getId());
                s.setName(student.getName());
                s.setAge(student.getAge());
                return ResponseEntity.ok().build();
            }
        }
        return ResponseEntity.notFound().build();
    }


    // Task7
    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<Student> deleteUser(@PathVariable int id) {
        for(Student s : studentList.students) {
            if(id == s.getId()) {
                studentList.students.remove(s);
                return ResponseEntity.ok().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    // Task8 - Wrapped all the responses inside ResponseEntity
    // Task9- Tested all the endpoints in Postman and managed to handle all the edge cases
}
