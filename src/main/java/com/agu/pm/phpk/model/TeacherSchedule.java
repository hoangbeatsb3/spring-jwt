package com.agu.pm.phpk.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "teacher_schedule")
@Getter
@Setter
public class TeacherSchedule {

    @EmbeddedId
    TeacherScheduleEmbeddedId id;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

}