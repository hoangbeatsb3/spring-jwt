package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.Class;
import com.agu.pm.phpk.model.Term;
import com.agu.pm.phpk.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("terms")
public class TermController {

    @Autowired
    private TermService service;

    @GetMapping("")
    public List<Term> getAll() {
        return service.getAll();
    }

    @PostMapping("")
    public Term createClass(@RequestBody Term c) {
        return service.createClass(c);
    }

    @PutMapping("")
    public void updateTerm(@RequestBody Term c) {
        service.update(c);
    }

    @DeleteMapping("")
    public void deleteTerm(@RequestParam("id") Integer termId) {
        service.deleteByTermId(termId);
    }

}
