package com.company;

public class Fish {
    private String kindOf;
    private int weidht;

    public Fish() {
    }

    public Fish(String kindOf, int weidht) {
        this.kindOf = kindOf;
        this.weidht = weidht;
    }

    public String getKindOf() {
        return kindOf;
    }

    public void setKindOf(String kindOf) {
        this.kindOf = kindOf;
    }

    public int getWeidht() {
        return weidht;
    }

    public void setWeidht(int weidht) {
        this.weidht = weidht;
    }
}
