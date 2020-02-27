package com.company;

import java.util.Scanner;

public class Sach extends SanPham{
    //Sách có thêm thông tin số trang
    //nghia la class Sach ke thua tu SanPham, va co them thuoc tinh soTrang
    private int soTrang;
    //Phuong thuc khoi tao cua lop sach
    Sach() {}
    public Sach(String tenSanPham, String motaSanPham,
                String nhaSanXuat, Float giaBan,
                int soTrang) {
        //super = "SanPham"
        //Goi phuong thuc khoi tao(constructor) cua lop cha
        super(tenSanPham, motaSanPham, nhaSanXuat, giaBan);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSach{" +
                "soTrang=" + soTrang +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();//goi den phuong thuc nhapthongTin cua lop cha(SanPhan)
        System.out.println("Nhap so trang:  ");
        this.soTrang = (new Scanner(System.in)).nextInt();
    }
}
