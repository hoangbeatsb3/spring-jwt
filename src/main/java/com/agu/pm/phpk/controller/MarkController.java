package com.agu.pm.phpk.controller;

import com.agu.pm.phpk.model.Mark;
import com.agu.pm.phpk.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarkController {

    @Autowired
    private MarkService service;

    @GetMapping("")
    public List<Mark> getAll() {
        return service.getAll();
    }

    @GetMapping("/student/{studentId}")
    public List<Mark> getByStudentId(@PathVariable("studentId") Integer studentId) {
        return service.getByStudentId(studentId);
    }

    @PostMapping("")
    public Mark createMark(@RequestBody Mark mark) {
        return service.createMark(mark);
    }

    @PutMapping("")
    public void updateMark(@RequestBody Mark mark) {
        service.updateMark(mark);
    }

    @DeleteMapping("/student/{student}/course/{course}/term/{term}")
    public void deleteMark(@PathVariable("student") Integer studentId,
                           @PathVariable("course") Integer subjectId,
                           @PathVariable("term") Integer termId) {
        service.deleteMark(studentId, subjectId, termId);
    }

}
