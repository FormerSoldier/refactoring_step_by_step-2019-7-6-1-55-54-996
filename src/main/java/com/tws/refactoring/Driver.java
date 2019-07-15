package com.tws.refactoring;

public class Driver {
    private int age;
    private static final int LEGAL_AGE = 18;

    public Driver() {
    }

    public boolean isLegalDriver() {
        return age >= LEGAL_AGE;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
