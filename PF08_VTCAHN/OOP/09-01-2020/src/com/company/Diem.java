package com.company;

public class Diem {
    private Float x;
    private Float y;
    //constructor = ham khoi tao
    Diem(Float x, Float y) {
        this.x = x;
        this.y = y;
    }
    Float getX() { //getter
        return this.x;
    }

    public void setX(Float x) {//setter
        this.x = x;
    }
    Float getY() {
        return this.y;
    }
    public void hienthongtin(){
        System.out.println("x = "+this.x+", y = "+this.y);
    }
    public Float tinhKhoangCach(Diem diemB) {
        //casting = ep kieu
        return (float)Math.sqrt(Math.pow(this.x - diemB.x, 2)
                + Math.pow(this.y - diemB.y, 2));
    }
    Diem() {

    }

}
