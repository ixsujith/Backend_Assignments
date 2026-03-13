package com.example.Task1to9;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.ArrayList;

@Service
public class StudentList {

    ArrayList<Student> students = new ArrayList<>();

    public StudentList() {
        students.add(new Student(1, "Student1", 21));
        students.add(new Student(2, "Student2", 21));
        students.add(new Student(3, "Student3", 21));
    }

    public ArrayList<Student> getValue() {
        return students;
    }

    public Student usingStudentID(int id) {
        for(Student s : students) {
            if(s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public Student usingStudentName(String name) {
        for(Student s : students) {
            if(s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }
}
