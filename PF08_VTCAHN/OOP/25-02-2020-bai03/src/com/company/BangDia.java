package com.company;

public class BangDia extends SanPham {
    //Băng đĩa có thêm thông tin độ dài thời gian phát.
    //nghia la: class BangDia ke thua tu SanPham, co them thuoc tinh "thoiGianPhat"
    private float thoiGianPhat;
    //phuong thuc khoi tao

    public BangDia(String tenSanPham, String motaSanPham,
                   String nhaSanXuat, Float giaBan,
                   float thoiGianPhat) {
        super(tenSanPham, motaSanPham, nhaSanXuat, giaBan);
        this.thoiGianPhat = thoiGianPhat;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nBangDia{" +
                "thoiGianPhat=" + thoiGianPhat +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
    }
}
