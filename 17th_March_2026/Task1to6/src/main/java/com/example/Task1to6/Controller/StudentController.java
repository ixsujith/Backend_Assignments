package com.example.Task1to6.Controller;

import com.example.Task1to6.DTO.StudentRequestDTO;
import com.example.Task1to6.DTO.StudentResponseDTO;
import com.example.Task1to6.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    private StudentService studentService;

    @GetMapping
    public List<StudentResponseDTO> allNames() {
        return studentService.studentList();
    }

    @PostMapping
    public String postDataController(@RequestBody StudentRequestDTO requestDTO) {
         return studentService.postDataService(requestDTO);
    }

    @GetMapping("{id}")
    public StudentResponseDTO getUsingIdController(@PathVariable Long id) {
        return studentService.getUsingIdService(id);
    }

    @PutMapping("{id}")
    public String updateDataController(@PathVariable Long id, @RequestBody StudentRequestDTO requestDTO) {
        return studentService.updateDataService(id, requestDTO);
    }

    @DeleteMapping("{id}")
    public String deleteDataController(@PathVariable Long id) {
        return studentService.deleteDataService(id);
    }
}
