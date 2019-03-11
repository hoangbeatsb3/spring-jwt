package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.service.TeacherService;
import org.springframework.web.bind.annotation.RestController;

import com.agu.pm.phpk.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping("")
    public List<Teacher> getAll() {
        return service.getAll();
    }

    @PostMapping("")
    public Teacher createTeacher(@RequestBody() Teacher teacher) {
        return service.createTeacher(teacher);
    }

    @PutMapping("/update")
    public void updateTeacher(@RequestBody() Teacher teacher) {
        service.updateTeacher(teacher);
    }

    @DeleteMapping("")
    public void deleteTeacher(@RequestParam("id") Integer id) {
        service.deleteTeacher(id);
    }

}
