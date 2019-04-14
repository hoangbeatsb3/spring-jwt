package com.agu.pm.phpk.service;

import com.agu.pm.phpk.model.Student;
import com.agu.pm.phpk.repository.MarkRepository;
import com.agu.pm.phpk.repository.StudentRepository;
import com.agu.pm.phpk.repository.StudentScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentScheduleRepository studentScheduleRepository;

    @Autowired
    private MarkRepository markRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.update(student.getName(), student.getPhone(), student.getEmail(), student.getId());
    }

    public void deleteStudent(Integer id) {
        markRepository.deleteMarkByStudentId(id);
        studentScheduleRepository.deleteStudentScheduleByStudentId(id);
        studentRepository.delete(id);
    }

    public List<String> getAllStudentsName() {
        return studentRepository.getAllStudentsName();
    }
}
