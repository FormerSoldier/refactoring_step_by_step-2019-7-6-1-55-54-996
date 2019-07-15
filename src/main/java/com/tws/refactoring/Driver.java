package com.tws.refactoring;

public class Driver {
    private int age;

    public Driver() {
    }

    public boolean isLegalDriver() {
        return age >= 18;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
