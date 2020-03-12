package com.learn.inheritance;

public class Cirle extends Shape {
    private Double radius; //Ban kinh

    public Cirle(String name, String color, Double radius) {
        super(name, color);
        this.radius = radius;
    }
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius + "\n";
    }
}
