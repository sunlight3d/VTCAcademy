package com.lab2.bai01;

public class MyCircle extends Ellipse {
    public MyCircle(Double banKinh) {
        super(banKinh, banKinh);
    }

    @Override
    public String toString() {
        return "Ban kinh = "+super.getBanKinhTrucNho();
    }
    //Tinh chu vi, dien tich , hay tan dung phuong thuc lop cha, ko nen viet lai

}
