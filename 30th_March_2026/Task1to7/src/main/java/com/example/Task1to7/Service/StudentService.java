package com.example.Task1to7.Service;

import com.example.Task1to7.DTO.StudentRequestDTO;
import com.example.Task1to7.DTO.StudentResponseDTO;
import com.example.Task1to7.Model.Student;
import com.example.Task1to7.Repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class StudentService {

    private Student toEntity(StudentRequestDTO requestDTO) {
        Student student = new Student();
        student.setName(requestDTO.getName());
        student.setAge(requestDTO.getAge());
        student.setEmailId(requestDTO.getEmailId());
        return student;
    }

    private StudentResponseDTO toDTO(Student student) {
        StudentResponseDTO responseDTO = new StudentResponseDTO();
        responseDTO.setId(student.getId());
        responseDTO.setName(student.getName());
        responseDTO.setAge(student.getAge());
        return responseDTO;
    }

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    private final StudentRepository studentRepository;

    public List<StudentResponseDTO> studentList() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(this::toDTO).toList();
    }

    @Transactional
    public Map<String, String> postDataService(StudentRequestDTO requestDTO) {
        Map<String, String> map = new HashMap();
        Student student = toEntity(requestDTO);
        studentRepository.save(student);
        map.put("message", "Student data added");
        return map;
    }

    public StudentResponseDTO getUsingIdService(Long id) {
//        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student data doesn't exist"));
//        return toDTO(student);
        if(id < 1){
            return toDTO(studentRepository.findById(id).orElseThrow(() -> new RuntimeException(("Provided id should be greater than 0"))));
        }

        return toDTO(studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student with id " + id + " is not found")));
    }

    @Transactional
    public Map<String, String> updateDataService(Long id, StudentRequestDTO requestDTO) {
        Map<String, String> map = new HashMap<>();
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student with id " + id + " is not found"));

            student.setName(requestDTO.getName());
            student.setAge(requestDTO.getAge());
            student.setEmailId(requestDTO.getEmailId());
            studentRepository.save(student);

            map.put("message", "Student data of id " + id + " has been updated");
        return map;
    }

    @Transactional
    public Map<String, String> deleteDataService(Long id) {
        Map<String, String> map = new HashMap<>();
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student with id " + id + "is not found"));
        studentRepository.deleteById(id);
        map.put("message", "Id " + id + " has been deleted");
        return map;
    }
}
