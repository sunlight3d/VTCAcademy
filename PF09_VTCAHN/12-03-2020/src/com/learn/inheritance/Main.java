package com.learn.inheritance;

import java.security.PrivilegedExceptionAction;

//Nhan xet: ca 2 class Rectangle va class Circle deu co thuoc tinh giong nhau la name, color
//De cho bai toan don gian hon
//Minh dinh nghia 1 lop cha(parent class = super class) ten la Shape(hinh dang, hinh bat ky)
//chua thong tin name, color
//RAt nhieu vi du khac ve ke thua:
//Vd: Person la cha cua Student
//Hay dung ke thua trong TH nao? minh co nhieu hon 1 lop con(sub class, child class
// //Vi du: minh co class Rectangle, Circle
//Bai toan cua minh chi co Rectangle
//A lop cha, B lop con cua A, C la cua B => chi len ke thua den <= 3
//thuc te chi len ke thua 2 levels
public class Main {
    public static void main(String[] args) {
        System.out.println("Tim hieu ve ke thua = inheritance");
        //test
        //Khoi tao 1 doi tuong hinh chu nhat(lop con = child class = sub class)
        Rectangle rectangleA = new Rectangle("hinh A", "red", 10.0, 20.0);
        System.out.println("Detail of Rectangle A  = "+rectangleA.toString());
        rectangleA.doSomething();
        rectangleA.doTaskA();//doTask bi Deprecated, sap sua vut di
        //Bai toan: Minh co project rat to, rat nhieu file goi den ham doTaskA, sua het doTaskA->doTaskB
        //co 1 tieu xao fix nhanh: viet 1 class ke thua tu class Rectangle kia
        //sau do viet 1 ham ten doTAskA, trong ham doTaskA goi den doTaskB
        rectangleA.doTaskB();
        //Tao ra 1 doi tuong Circle
        Cirle c1 = new Cirle("circle A", "blue", 5.0);
        System.out.println("Dien tich hinh tron A = "+c1.getArea());
        System.out.println("Detail of c1 = "+c1.toString());
    }
}
