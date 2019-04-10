package com.agu.pm.phpk.service;

import com.agu.pm.phpk.model.Class;
import com.agu.pm.phpk.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassRepository repository;

    public List<Class> getAll() {
        return repository.findAll();
    }

    public void update(Class c) {
        repository.update(c.getName(), c.getId());
    }

    public void deleteByClassId(Integer classId) {
        repository.deleteByClassId(classId);
    }

    public Class createClass(Class c) {
        return repository.save(c);
    }
}
