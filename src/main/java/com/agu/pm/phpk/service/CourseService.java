package com.agu.pm.phpk.service;

import com.agu.pm.phpk.model.Course;
import com.agu.pm.phpk.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public List<Course> getAll() {
        return repository.findAll();
    }

    public Course getCourseById(Integer id) {
        return repository.findById(id);
    }

    public Course createCourse(Course course) {
        return repository.save(course);
    }

    public List<String> getAllCoursesName(){
        return repository.getAllCoursesName();
    }

    public Course getCourseByName(String name){
        return repository.findByName(name).stream().findFirst().get();
    }

    public void deleteCourseById(Integer id) {
        repository.delete(id);
    }


    public void updateCourse(Course course) {
        repository.update(course.getName(), course.getStartTime(), course.getEndTime(), course.getId());
    }

}
