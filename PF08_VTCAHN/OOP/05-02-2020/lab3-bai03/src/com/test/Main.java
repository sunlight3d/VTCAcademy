package com.test;

import com.company.Circle;
import com.company.Point2D;
//src = source
public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1.0, 1.0);
        Point2D p2 = new Point2D(2.0, 2.0);
        Circle c1 = new Circle(1.0,1.0, 1.0);
        Circle c2 = new Circle(2.0,2.0, 4.0);
        c1.moveUp();
        c1.moveUp();
        c1.moveUp();
        c1.moveUp();
        c1.moveDown();
        c1.moveDown();
        System.out.println(c1);
        System.out.println("Hello");
    }
}
