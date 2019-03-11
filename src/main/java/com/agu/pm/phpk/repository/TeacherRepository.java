package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.Teacher;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TeacherRepository extends org.springframework.data.repository.Repository<Teacher, Integer>{

    List<Teacher> findAll();

    Teacher save(Teacher teacher);

    @Modifying
    @Transactional
    @Query("update Teacher set name = ?1, phone = ?2, email = ?3 where id = ?4")
    void update(String name, String phone, String email, Integer id);

    @Modifying
    @Transactional
    @Query("delete from Teacher where id = ?1")
    void delete(Integer id);

}