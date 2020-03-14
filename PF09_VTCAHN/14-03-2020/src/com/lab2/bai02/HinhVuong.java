package com.lab2.bai02;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(double canh) {
        super(canh, canh);
    }

    @Override
    public String toString() {
        return "Canh = "+super.getChieuDai();
    }
    //cac phuong thuc tinh dien tich, chu vi, ko can override vi van dung chung duoc

}
