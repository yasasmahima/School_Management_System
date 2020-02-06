package com.example.demo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Parent {
    private String name;
    private int contactNo;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Parent() {
    }

    public Parent(String name, int contactNo, String job) {
        this.name = name;
        this.contactNo = contactNo;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", contactNo=" + contactNo +
                ", job='" + job + '\'' +
                '}';
    }
}
