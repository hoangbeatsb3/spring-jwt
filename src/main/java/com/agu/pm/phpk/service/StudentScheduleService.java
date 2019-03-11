package com.agu.pm.phpk.service;

import com.agu.pm.phpk.model.StudentSchedule;
import com.agu.pm.phpk.repository.StudentScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScheduleService {

    @Autowired
    private StudentScheduleRepository repository;

    public List<StudentSchedule> getAll() {
        return repository.findAll();
    }

    public List<StudentSchedule> getByStudentId(Integer studentId) {
        return repository.findByIdStudentIdId(studentId);
    }

    public StudentSchedule createStudentSchedule(StudentSchedule studentSchedule) {
        return repository.save(studentSchedule);
    }
}
