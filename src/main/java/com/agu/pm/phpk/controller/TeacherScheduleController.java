package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.StudentSchedule;
import com.agu.pm.phpk.model.TeacherSchedule;
import com.agu.pm.phpk.service.StudentScheduleService;
import com.agu.pm.phpk.service.TeacherScheduleService;
import com.agu.pm.phpk.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher-schedule")
public class TeacherScheduleController {

    @Autowired
    private TeacherScheduleService service;

    @GetMapping("")
    public List<TeacherSchedule> getAll() {
        return service.getAll();
    }

    @PostMapping("")
    public TeacherSchedule createStudentSchedule(@RequestBody TeacherSchedule teacherSchedule) {
        return service.createStudentSchedule(teacherSchedule);
    }

}
