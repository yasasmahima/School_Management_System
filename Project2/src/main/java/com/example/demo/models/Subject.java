package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Subject {

    private String subjectName;
    @Autowired
    private Level level;
    @Autowired
    private  Batch batch;


    public Subject(String subjectName, Level level, Batch batch) {
        this.subjectName = subjectName;
        this.level = level;
        this.batch = batch;
    }

    public Subject() {
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", level=" + level +
                ", batch=" + batch +
                '}';
    }
}
