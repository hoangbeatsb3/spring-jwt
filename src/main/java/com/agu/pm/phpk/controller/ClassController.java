package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.Class;
import com.agu.pm.phpk.model.StudentSchedule;
import com.agu.pm.phpk.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

    @Autowired
    private ClassService service;

    @GetMapping("")
    public List<Class> getAll() {
        return service.getAll();
    }

    @PostMapping("")
    public Class createClass(@RequestBody Class c) {
        return service.createClass(c);
    }

    @PutMapping("")
    public void updateClass(@RequestBody Class c) {
        service.update(c);
    }

    @DeleteMapping("")
    public void deleteClass(@RequestParam("id") Integer classId) {
        service.deleteByClassId(classId);
    }

}
