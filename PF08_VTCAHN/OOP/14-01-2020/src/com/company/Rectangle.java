package com.company;

public class Rectangle {
    private Float width;
    private Double height;
    //Ham khoi tao = Constructor method(trung ten voi class)
    Rectangle(){
        //default constructor = Ham khoi tao mac dinh
        // = ham khoi tao ko co tham so
        width = 0.0f;
        height = 0.0;
        System.out.println("This is default constructor");
    }
    Rectangle(Float width) {
        this.width = width;
    }
    Rectangle(Float width, Double height) {
        System.out.println("This is constructor with params");
        this.width = width;
        this.height = height;
    }
}
