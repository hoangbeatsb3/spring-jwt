package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.Course;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CourseRepository extends org.springframework.data.repository.Repository<Course, Integer>{

    List<Course> findAll();

    Course findById(Integer id);

    List<Course> findByName(String name);

    Course save(Course course);

    @Query("select name from Course")
    List<String> getAllCoursesName();

    @Modifying
    @Transactional
    @Query("delete from Course where id = ?1")
    void delete(Integer id);

    @Modifying
    @Transactional
    @Query("update Course set name = ?1, start_time = ?2, end_time = ?3 where id = ?4")
    void update(String name, LocalDate startTime, LocalDate endTime, Integer id);

}
