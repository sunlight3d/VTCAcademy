package com.company;

public class Diem {
    private Double x;
    private Double y;
    public void show(){
        System.out.println("x = "+this.x+
                "y = "+this.y);
    }
    //constructor with params
    public Diem(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
