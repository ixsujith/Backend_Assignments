package com.example.Task1to6.Service;

import com.example.Task1to6.DTO.StudentRequestDTO;
import com.example.Task1to6.DTO.StudentResponseDTO;
import com.example.Task1to6.Model.Student;
import com.example.Task1to6.Repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public String postDataService(StudentRequestDTO requestDTO) {
        Student student = toEntity(requestDTO);
        studentRepository.save(student);
        return "Student added";
    }

    public StudentResponseDTO getUsingIdService(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student data doesn't exist"));
        return toDTO(student);

    }

    @Transactional
    public String updateDataService(Long id, StudentRequestDTO requestDTO) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student data doesn't exist"));

            student.setName(requestDTO.getName());
            student.setAge(requestDTO.getAge());
            student.setEmailId(requestDTO.getEmailId());
            studentRepository.save(student);
        return "Student data of id " + id + " updated";
    }

    @Transactional
    public String deleteDataService(Long id) {
        studentRepository.deleteById(id);
        return "Id " + id + " has been deleted";
    }
}
