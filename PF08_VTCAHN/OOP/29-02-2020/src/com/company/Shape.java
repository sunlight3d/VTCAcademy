package com.company;

//abstract class chua phuong thuc abstract
abstract class Shape {
    private String name;//co the them thuoc tinh instance vao trong abstract class
    //abstract = unfinished, dang do, chua hoan thanh
    //phuong thuc tinh dien tich

    //ko tinh duoc ?, phuong thuc getArea() tinh dien tich
    //hinh bat ky la ko duoc
    public abstract Double getArea(); //phuong thuc abstract ko co phan thuc thi
    //phuong thuc tinh chu vi hinh bat ky
    //ko tinh duoc, phuong thuc do la abstract
    //chi co phan khai bao, ko co phan thuc thi
    public abstract Double getPerimeter();
    //cac phuong thuc abstract giong cac phuong thuc trong interface o cho:
    // deu ko co phan thuc thi
    //Abstract class chua ham khoi tao ? Yes
    Shape(String name) {
        this.name = name;
    }
}
