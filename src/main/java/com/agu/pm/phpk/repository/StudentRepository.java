package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends org.springframework.data.repository.Repository<Student, Integer>{

    List<Student> findAll();

    Student save(Student student);

    @Modifying
    @Transactional
    @Query("update Student set name = ?1, phone = ?2, email = ?3, birth = ?4, gender = ?5, title = ?6 where id = ?7")
    void update(String name, String phone, String email, LocalDate birth, String gender, String title, Integer id);

    @Modifying
    @Transactional
    @Query("delete from Student where id = ?1")
    void delete(Integer id);

    @Query("select name from Student")
    List<String> getAllStudentsName();
}
