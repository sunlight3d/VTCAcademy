package com.company;

public class TamGiac extends Hinh{
    Double a,b,c;
    public TamGiac(String ten, Double a, Double b, Double c) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public Double tinhDienTich() {
        //s = nua chu vi = p/2
        Double s = tinhChuVi() / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public Double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "TamGiac{" +
                "ten : " + super.getTen()+
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
