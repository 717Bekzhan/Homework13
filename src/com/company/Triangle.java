package com.company;

public class Triangle {
    private int a;
    private int b;
    private int c;

    private  void area(){
        int area = (a*b)/2;
        System.out.println(area);
    }public void area1(){
        area();
    }

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
