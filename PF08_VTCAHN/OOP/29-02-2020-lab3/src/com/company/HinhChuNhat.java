package com.company;

public class HinhChuNhat extends Hinh {
    private double chieuDai, chieuRong;

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

    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public Double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public Double tinhChuVi() {
        return 2*(chieuDai + chieuRong);
    }
}
