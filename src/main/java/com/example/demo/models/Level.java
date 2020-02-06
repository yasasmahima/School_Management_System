package com.example.demo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Level {

    private int levelNo;

    public Level(int levelNo) {
        this.levelNo = levelNo;
    }

    public Level() {
    }

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    @Override
    public String toString() {
        return "Level{" +
                "levelNo=" + levelNo +
                '}';
    }
}
