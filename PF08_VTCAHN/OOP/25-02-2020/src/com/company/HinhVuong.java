package com.company;
//extends = inherits = ke thua
public class HinhVuong extends HinhChuNhat{
    //HinhVuong la lop con(child class, sub class) cua HinhChuNhat
    //Phuong thuc khoi tao cua lop con(HinhVuong)
    HinhVuong(double canh) {
        this.setChieuDai(canh);
        this.setChieuRong(canh);
    }
    //toString : override(ghi de) tu phuong thuc toString cua lop cha(HinhChuNhat)
    @Override
    public String toString() {
        return "Hinh vuong co canh = "+this.getChieuRong();
    }
}
