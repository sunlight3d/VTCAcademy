package com.lab2.bai02;

public class HinhChuNhat {
    private double chieuDai, chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public double tinhChuVi() {
        return 2* (chieuDai + chieuRong);
    }
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public String toString() {
        return "chieuDai=" + chieuDai + "\n" +
                "chieuRong=" + chieuRong + "\n";
    }
}
