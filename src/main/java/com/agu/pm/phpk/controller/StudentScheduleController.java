package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.StudentSchedule;
import com.agu.pm.phpk.service.StudentScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student-schedule")
public class StudentScheduleController {

    @Autowired
    private StudentScheduleService service;

    @GetMapping("")
    public List<StudentSchedule> getAll() {
        return service.getAll();
    }

    @GetMapping("/student/{id}")
    public List<StudentSchedule> getByStudentId(@PathVariable("id") Integer studentId) {
        return service.getByStudentId(studentId);
    }


    @PostMapping("")
    public StudentSchedule createStudentSchedule(@RequestBody StudentSchedule studentSchedule) {
        return service.createStudentSchedule(studentSchedule);
    }

}
