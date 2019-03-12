package com.agu.pm.phpk.service;

import com.agu.pm.phpk.model.StudentSchedule;
import com.agu.pm.phpk.model.TeacherSchedule;
import com.agu.pm.phpk.repository.StudentScheduleRepository;
import com.agu.pm.phpk.repository.TeacherScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherScheduleService {

    @Autowired
    private TeacherScheduleRepository repository;

    public List<TeacherSchedule> getAll() {
        return repository.findAll();
    }

    public TeacherSchedule createStudentSchedule(TeacherSchedule teacherSchedule) {
        return repository.save(teacherSchedule);
    }

    public List<TeacherSchedule> getTeacherScheduleByTeacherId(Integer teacherId) {
        return repository.findByIdTeacherIdId(teacherId);
    }
}
