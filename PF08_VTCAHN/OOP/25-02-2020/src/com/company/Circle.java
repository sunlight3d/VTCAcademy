package com.company;
//Circle = "sub class" = child class = lop con cua Ellipse
public class Circle extends Ellipse {
    Circle(double bk) {
        this.setBkTrucLon(bk);
        this.setBkTrucNho(bk);
    }

    @Override //lop cha co phuong thuc toString, lop con cung co phuong thuc toString
    //lop con viet lai phuong thuc toString = ghi de = override
    public String toString() {
        return "Ban kinh = "+this.getBkTrucLon()+"\n";
    }
    //chu vi, dien tich hinh tron
    //dung luon ten phuong thuc "tinhChuVi", "tinhDienTich" cua lop cha(Ellipse)
    //=> override


    @Override
    public double tinhChuVi() {
        return 2 * Math.PI* getBkTrucLon();
    }

    @Override
    public double tinhDienTich() {
        //return Math.PI * Math.pow(getBkTrucLon(), 2);
        return super.tinhDienTich(); //co chay ko ?
        //Co chay YES, vi "cong thuc tinh dien tich hinh elip co the
        // ap dung tinh dien tich hinh tron"
    }
}
