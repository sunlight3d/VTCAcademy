package com.lab2.bai01;

public class Ellipse {
    Double banKinhTrucLon, banKinhTrucNho;
    public Ellipse(Double banKinhTrucLon, Double getBanKinhTrucNho) {
        this.banKinhTrucLon = banKinhTrucLon;
        this.banKinhTrucNho = getBanKinhTrucNho;
    }
    public Double tinhDienTich() {
        return Math.PI * banKinhTrucLon * banKinhTrucNho;
    }
    public Double tinhChuVi() {
        return Math.PI * (3 * (banKinhTrucLon + banKinhTrucNho)
                - Math.sqrt((3*banKinhTrucLon + banKinhTrucNho) * (banKinhTrucLon + 3* banKinhTrucNho)));
    }

    public Double getBanKinhTrucLon() {
        return banKinhTrucLon;
    }

    public void setBanKinhTrucLon(Double banKinhTrucLon) {
        this.banKinhTrucLon = banKinhTrucLon;
    }

    public Double getBanKinhTrucNho() {
        return banKinhTrucNho;
    }

    public void setBanKinhTrucNho(Double banKinhTrucNho) {
        this.banKinhTrucNho = banKinhTrucNho;
    }

    @Override
    public String toString() {
        return "banKinhTrucLon=" + banKinhTrucLon + "\n"+
                "getBanKinhTrucNho=" + banKinhTrucNho + "\n";

    }
}
