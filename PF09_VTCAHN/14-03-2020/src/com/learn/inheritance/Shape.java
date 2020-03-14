package com.learn.inheritance;

public class Shape {
    private String name, color;

    public Shape() {
        name = "";
        color = "";
    }
    Shape(String name, String color) {
        System.out.println("constructor cua lop cha");
        this.name = name;
        this.color = color;
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
    //Ke thua phuong thuc toString

    @Override
    public String toString() {
        return "name = " + name + "\n" +
                "color='" + color + "\n";
    }
}
