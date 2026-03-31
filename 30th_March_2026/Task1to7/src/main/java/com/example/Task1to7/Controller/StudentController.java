package com.example.Task1to7.Controller;

import com.example.Task1to7.DTO.StudentRequestDTO;
import com.example.Task1to7.DTO.StudentResponseDTO;
import com.example.Task1to7.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/student")
public class StudentController {

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    private StudentService studentService;

//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<String> handleException(RuntimeException re) {
//        return new ResponseEntity<>("Error: " + re.getMessage(), HttpStatus.BAD_REQUEST);
//    }

    @GetMapping
    public List<StudentResponseDTO> allNames() {
        return studentService.studentList();
    }

    @PostMapping
    public Map<String, String> postDataController(@Valid @RequestBody StudentRequestDTO requestDTO) {
         return studentService.postDataService(requestDTO);
    }

    @GetMapping("{id}")
    public StudentResponseDTO getUsingIdController(@PathVariable Long id) {
        return studentService.getUsingIdService(id);
    }

    @PutMapping("{id}")
    public Map<String, String> updateDataController(@Valid @PathVariable Long id, @RequestBody StudentRequestDTO requestDTO) {
        return studentService.updateDataService(id, requestDTO);
    }

    @DeleteMapping("{id}")
    public Map<String, String> deleteDataController(@PathVariable Long id) {
        return studentService.deleteDataService(id);
    }
}
