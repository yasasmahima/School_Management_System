package com.example.demo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Batch {

    private String batchName;
    private String batchID;

    public Batch(String batchName, String batchID) {
        this.batchName = batchName;
        this.batchID = batchID;
    }

    public Batch() {
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchName='" + batchName + '\'' +
                ", batchID='" + batchID + '\'' +
                '}';
    }
}
