package com.example.Task1to8;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> studentList() {
        return studentRepository.findAll();
    }

    @PostMapping("/addStudents")
    public String addStudents(@RequestBody @Valid Student student) {
        studentRepository.save(student);
        return "Student added";
    }

    @GetMapping("{id}")
    public Student getUsingId(@PathVariable Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public String deleteStudentData(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return "Student data deleted";
    }

    @GetMapping("/getUsingName")
    public List<Student> getUsingName(@RequestParam String name) {
        return studentRepository.findByName(name);
    }

    @GetMapping("sample")
    public List<Student> sample(@RequestParam(defaultValue = "21") int age) {
        return studentRepository.findByAge(age);
    }

    @GetMapping("/findAllByAge/{age}")
    public List<Student> findAllByAge(@PathVariable int age) {
        return studentRepository.findAllByAge(age);
    }

    @GetMapping("/countBy")
    public int countBy(@RequestParam String name) {
        return studentRepository.countByName(name);
    }

    @GetMapping("/countBy/{age}")
    public int countBy(@PathVariable int age) {
        return studentRepository.countByAge(age);
    }

    @GetMapping("/queryAge/{age}")
    public List<Student> queryAge(@PathVariable int age) {
        return studentRepository.findByQueryAge(age);
    }


}
