package com.company;

public class Parrot {
    private int age;
    public int weidht;
    private char gender;

    public Parrot() {
    }

    public Parrot(int age, int weidht, char gender) {
        this.age = age;
        this.weidht = weidht;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeidht() {
        return weidht;
    }

    public void setWeidht(int weidht) {
        this.weidht = weidht;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
