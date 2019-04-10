package com.agu.pm.phpk.service;

import com.agu.pm.phpk.model.Mark;
import com.agu.pm.phpk.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkService {

    @Autowired
    private MarkRepository repository;

    public List<Mark> getAll() {
        return repository.findAll();
    }

    public List<Mark> getByStudentId(Integer studentId) {
        return repository.findByIdStudentId(studentId);
    }

    public Mark createMark(Mark mark) {
        return repository.save(mark);
    }

    public void updateMark(Mark mark) {
        repository.updateMark(mark.getMark(), mark.getId().getStudent().getId(), mark.getId().getCourse().getId(), mark.getId().getTerm().getId());
    }

    public void deleteMark(Integer studentId, Integer subjectId, Integer termId) {
        repository.deleteMark(studentId, subjectId, termId);
    }
}
