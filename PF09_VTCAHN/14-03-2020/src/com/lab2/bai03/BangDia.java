package com.lab2.bai03;

public class BangDia  extends SanPham{
    private Float thoiGianPhat;//45p
    public BangDia() {}
    public BangDia(String maSanPham,
                   String tenSanPham,
                   String motaSanPham,
                   String nhaSanXuat,
                   Float giaBan,
                   Float thoiGianPhat) {
        super(maSanPham, tenSanPham, motaSanPham, nhaSanXuat, giaBan);
        this.thoiGianPhat = thoiGianPhat;
    }
    //Se phai co 1 class trung trang quan ly viec nhap Sach va Bang dia
    @Override
    public void input() {
        super.input();
        System.out.println("Nhap thoiGianPhat");
        this.thoiGianPhat = getScanner().nextFloat();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "thoiGianPhat=" + thoiGianPhat;

    }
}
