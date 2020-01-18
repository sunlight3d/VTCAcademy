package com.company;

public class Shape {
    //super class = parent class = base class = lop cha
    protected String color;
    private String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
        System.out.println("Constructor of Shape");
    }
    public void show() {
        System.out.println("Name = "+this.name+",Color = "+this.color);
    }
}
