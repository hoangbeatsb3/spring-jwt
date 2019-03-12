package com.agu.pm.phpk.service;

import com.agu.pm.phpk.model.Term;
import com.agu.pm.phpk.repository.TermRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermService {

    @Autowired
    private TermRepository repository;

    public List<Term> getAll() {
        return repository.findAll();
    }

    public void update(Term c) {
        repository.update(c.getName(), c.getId());
    }

    public void deleteByTermId(Integer termId) {
        repository.deleteByTermId(termId);
    }

    public Term createClass(Term c) {
        return repository.save(c);
    }

}
