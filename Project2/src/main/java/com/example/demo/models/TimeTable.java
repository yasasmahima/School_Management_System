package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class TimeTable {

    @Autowired
    private Subject subject;
    @Autowired
    private Teacher teacher;
    @Autowired
    private Level level;
    @Autowired
    private Batch batch;
    private LocalTime time;

    public TimeTable(Subject subject, Teacher teacher, Level level, Batch batch, LocalTime time) {
        this.subject = subject;
        this.teacher = teacher;
        this.level = level;
        this.batch = batch;
        this.time = time;
    }

    public TimeTable() {
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Level getLevel() {
        return level;
    }

    public Batch getBatch() {
        return batch;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "TimeTable{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", level=" + level +
                ", batch=" + batch +
                ", time=" + time +
                '}';
    }
}
