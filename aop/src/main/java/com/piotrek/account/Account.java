package com.piotrek.account;

import org.springframework.stereotype.Component;

@Component
public class Account {

    private String name;
    private int level;

    public Account() {}

    public Account(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        System.out.println(this.getClass() + ": getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(this.getClass() + ": setName()");
        this.name = name;
    }

    public int getLevel() {
        System.out.println(this.getClass() + ": getLevel()");
        return level;
    }

    public void setLevel(int level) {
        System.out.println(this.getClass() + ": setLevel()");
        this.level = level;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}