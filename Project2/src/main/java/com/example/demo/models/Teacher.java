package com.example.demo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Teacher {

    private String name;
    private Subject subject;
    private int contactNo;

    public Teacher(String name, Subject subject, int contactNo) {
        this.name = name;
        this.subject = subject;
        this.contactNo = contactNo;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
