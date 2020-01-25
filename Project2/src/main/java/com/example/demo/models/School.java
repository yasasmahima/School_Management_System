package com.example.demo.models;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class School {

    private String name;
    private String regId;
    private String location;

    public School(String name, String regId, String location) {
        this.name = name;
        this.regId = regId;
        this.location = location;
    }

    public School() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", regId='" + regId + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
