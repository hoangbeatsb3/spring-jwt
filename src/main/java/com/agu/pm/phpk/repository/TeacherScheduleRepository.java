package com.agu.pm.phpk.repository;

import com.agu.pm.phpk.model.TeacherSchedule;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TeacherScheduleRepository extends org.springframework.data.repository.Repository<TeacherSchedule, Integer>{

    List<TeacherSchedule> findAll();

    TeacherSchedule save(TeacherSchedule teacherSchedule);

    @Modifying
    @Transactional
    @Query(value = "delete from Teacher_Schedule where teacher_id = ?1", nativeQuery = true)
    void deleteTeacherScheduleByTeacherId(Integer studentId);

    List<TeacherSchedule> findByIdTeacherIdId(Integer teacherId);
}
