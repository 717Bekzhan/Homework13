package com.company;

public class Cat {
    private String name;
    private String color;
    private String paroda;

    public Cat() {
    }

    public Cat(String name, String color, String paroda) {
        this.name = name;
        this.color = color;
        this.paroda = paroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }
}
