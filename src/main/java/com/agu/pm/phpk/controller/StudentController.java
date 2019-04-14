package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.Student;
import com.agu.pm.phpk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("names")
    public List<String> getAllStudentsName() {
        return service.getAllStudentsName();
    }

    @GetMapping("")
    public List<Student> getAll() {
        return service.getAll();
    }

    @PostMapping("")
    public Student createStudent(@RequestBody() Student student) {
        return service.createStudent(student);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody() Student student) {
        service.updateStudent(student);
    }

    @DeleteMapping("")
    public void deleteStudent(@RequestParam("id") Integer id) {
        service.deleteStudent(id);
    }

}
