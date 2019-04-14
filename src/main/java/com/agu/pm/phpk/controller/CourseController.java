package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.Course;
import com.agu.pm.phpk.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PreUpdate;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("")
    public List<Course> getAll() {
        return service.getAll();
    }

    @PostMapping("")
    public Course createCourse(@RequestBody Course course) {
        System.out.println(course.getName());
        System.out.println(course.getStartTime());
        System.out.println(course.getEndTime());
        return service.createCourse(course);
    }

    @PutMapping("")
    public void updateCourse(@RequestBody Course course) {
        service.updateCourse(course);
    }

    @GetMapping("/names")
    public List<String> getAllCoursesName() {
        return service.getAllCoursesName();
    }

    @GetMapping("/names/{name}")
    public Course getAllCoursesName(@PathVariable("name") String name) {
        return service.getCourseByName(name);
    }

    @GetMapping("/id/{id}")
    public Course getById(@PathVariable("id") Integer id) {
        return service.getCourseById(id);
    }

    @DeleteMapping("")
    public void deleteCourseById(@RequestParam("id") Integer id) {
        service.deleteCourseById(id);
    }

}
