package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.Class;
import com.agu.pm.phpk.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
