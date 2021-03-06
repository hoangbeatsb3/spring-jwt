package com.agu.pm.phpk.service;

import com.agu.pm.phpk.model.Student;
import com.agu.pm.phpk.model.Teacher;
import com.agu.pm.phpk.repository.TeacherRepository;
import com.agu.pm.phpk.repository.TeacherScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private TeacherScheduleRepository teacherScheduleRepository;

    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        teacherRepository.update(teacher.getName(), teacher.getPhone(), teacher.getEmail(), teacher.getBirth(), teacher.getGender(), teacher.getSalary(), teacher.getId());
    }

    public void deleteTeacher(Integer id) {
        teacherScheduleRepository.deleteTeacherScheduleByTeacherId(id);
        teacherRepository.delete(id);
    }

}
