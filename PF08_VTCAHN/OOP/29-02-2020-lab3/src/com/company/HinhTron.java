package com.company;


public class HinhTron extends Ellipse {
    HinhTron(Double banKinh) {
        super("", banKinh, banKinh);

    }
    @Override
    public Double tinhDienTich() {
        return Math.PI * super.getTrucLon() * super.getTrucLon();
    }

    @Override
    public Double tinhChuVi() {
        return 2 * Math.PI * super.getTrucLon();
    }

    @Override
    public String toString() {
        return "ban kinh = "+super.getTrucLon();
    }
}
