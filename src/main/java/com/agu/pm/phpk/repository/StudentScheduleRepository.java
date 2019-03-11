package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.StudentSchedule;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentScheduleRepository extends org.springframework.data.repository.Repository<StudentSchedule, Integer>{

    List<StudentSchedule> findAll();

    List<StudentSchedule> findByIdStudentIdId(Integer studentId);

    StudentSchedule save(StudentSchedule studentSchedule);
}
