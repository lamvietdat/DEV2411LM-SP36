package devmaster.lesson03.controller;

import devmaster.lesson03.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student-list")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/student/{id}")
    public Student getAllStudents(@PathVariable String id){
        Long param=Long.parseLong(id);
        return studentService.getStudent(param);
    }
}
