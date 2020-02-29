package com.company;

public class Rectangle  extends Shape {
    private Double width, height;
    //Mot class ke thua tu abstract class thi
    //class do BAT BUOC PHAI  thuc thi(override) cac phuong thuc cua  abtract class do

    @Override
    //override = thuc thi phuong thuc co ten/tham so giong het phuong thuc lop cha
    public Double getArea() {
        return this.width * this.height;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (width * height);
    }

    Rectangle(String name, Double width, Double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
