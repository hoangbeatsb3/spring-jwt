package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.TeacherSchedule;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherScheduleRepository extends org.springframework.data.repository.Repository<TeacherSchedule, Integer>{

    List<TeacherSchedule> findAll();

    TeacherSchedule save(TeacherSchedule teacherSchedule);


    List<TeacherSchedule> findByIdTeacherIdId(Integer teacherId);
}
