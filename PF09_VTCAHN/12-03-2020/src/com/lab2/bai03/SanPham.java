package com.lab2.bai03;

import java.util.Scanner;

public class SanPham {
    private String maSanPham, tenSanPham, motaSanPham, nhaSanXuat;
    private Float giaBan;
    public Boolean isUpdate = false;
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    public SanPham() {}
    public SanPham(String maSanPham,
                   String tenSanPham,
                   String motaSanPham,
                   String nhaSanXuat,
                   Float giaBan) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.motaSanPham = motaSanPham;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMotaSanPham() {
        return motaSanPham;
    }

    public void setMotaSanPham(String motaSanPham) {
        this.motaSanPham = motaSanPham;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public Float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Float giaBan) {
        this.giaBan = giaBan;
    }
    public void input() {
//        maSanPham, , , ;
//        private Float giaBan;
        if(isUpdate == false) {
            System.out.println("Nhap maSanPham");
            this.maSanPham = getScanner().nextLine();
        }
        System.out.println("Nhap tenSanPham");
        this.tenSanPham = getScanner().nextLine();

        System.out.println("Nhap motaSanPham");
        this.motaSanPham = getScanner().nextLine();

        System.out.println("Nhap nhaSanXuat");
        this.nhaSanXuat = getScanner().nextLine();

        System.out.println("Nhap giaBan");
        this.giaBan = getScanner().nextFloat();

    }
}
