package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.Mark;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MarkRepository extends org.springframework.data.repository.Repository<Mark, Integer>{

    List<Mark> findAll();

    List<Mark> findByIdStudentId(Integer studentId);

//    Mark save(Mark mark);
//
//    List<Mark> findByStudentId(Integer studentId);
//
//    List<Mark> findBySubjectId(Integer subjectId);
//
//    @Modifying
//    @Transactional
//    @Query("update Mark set mark = ?1 where student_id = ?2 and subject_id = ?3")
//    void updateMark(Float mark, Integer student_id, Integer subject_id);
//
//    @Modifying
//    @Transactional
//    @Query("delete from Mark where student_id = ?1 and subject_id = ?2")
//    void deleteMark(Integer studentId, Integer subjectId);
}
