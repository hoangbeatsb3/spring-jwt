package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.StudentSchedule;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentScheduleRepository extends org.springframework.data.repository.Repository<StudentSchedule, Integer>{

    List<StudentSchedule> findAll();

    List<StudentSchedule> findByIdStudentIdId(Integer studentId);

    @Query(value = "select count(*) from Student_Schedule where class_id = ?1", nativeQuery = true)
    Integer getByClassId(Integer classId);

    StudentSchedule save(StudentSchedule studentSchedule);

}
