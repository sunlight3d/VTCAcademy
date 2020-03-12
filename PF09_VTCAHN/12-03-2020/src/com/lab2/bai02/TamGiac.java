package com.lab2.bai02;

public class TamGiac {
    private Double a, b, c;
    public TamGiac(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Double tinhDienTich() {
        Double s = this.tinhChuVi()/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    public Double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "TamGiac{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

}
