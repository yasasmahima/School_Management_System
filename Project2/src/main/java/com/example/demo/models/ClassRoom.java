package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Scope("prototype")
public class ClassRoom {

    private String className;

    @Autowired

    private Teacher incharge;

    private ArrayList<Student> students=new ArrayList<>();

    @Autowired
    private Batch batch;

    public ClassRoom(String className, Teacher incharge, Batch batch,ArrayList<Student> students) {
        this.className = className;
        this.incharge = incharge;
        this.students = students;
        this.batch=batch;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ClassRoom(String className, Teacher incharge) {
        this.className = className;
        this.incharge = incharge;
    }

    public Teacher getIncharge() {
        return incharge;
    }

    public void setIncharge(Teacher incharge) {
        this.incharge = incharge;
    }

    public ClassRoom() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "className='" + className + '\'' +
                ", incharge=" + incharge +
                ", students=" + students +
                ", batch=" + batch +
                '}';
    }
}
