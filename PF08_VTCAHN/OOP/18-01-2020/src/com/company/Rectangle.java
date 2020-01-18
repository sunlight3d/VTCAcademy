package com.company;

public class Rectangle extends Shape {
    private Double width;
    private Double height;
    public Rectangle(String color, String name, Double width, Double height) {
        super(color, name);
        this.width = width;
        this.height = height;
        super.color = "green";//color is "protected"
        System.out.println("Constructor of Rectangle");
    }

    @Override //Annotations
    public void show() {
        super.show();
        System.out.println("Width = "+this.width+",Height = "+this.height);
    }
}
