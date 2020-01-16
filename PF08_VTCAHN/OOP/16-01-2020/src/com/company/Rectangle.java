package com.company;

public class Rectangle {
    private Diem topleft;
    private Diem rightBottom;

    public Rectangle(Diem topleft, Diem rightBottom) {
        this.topleft = topleft;
        this.rightBottom = rightBottom;
    }
    private Double getWidth() {
        return Math.abs(topleft.getX() - rightBottom.getX());
    }
    private Double getHeight() {
        return Math.abs(topleft.getY() - rightBottom.getY());
    }
    //Tinh dien tich
    public Double getArea() {
        return getWidth() * getHeight();
    }
    //Tinh chu vi
    public Double getPerimeter() {
        return 2*(getWidth() + getHeight());
    }
    public void show(){
        System.out.println("\ntopLeft's x "+this.topleft.getX()+
                            "\ntopLeft's y "+this.topleft.getY()+
                        "\nbottomRight's x = "+this.rightBottom.getX()+
                        "\nbottomRight's y = "+this.rightBottom.getY()+
                        "\narea = "+this.getArea()+
                        "\nperimeter = "+this.getPerimeter());
    }
}
