package com.company;

import java.util.Scanner;

public class SanPham {
    private String tenSanPham;
    private String motaSanPham;
    private String nhaSanXuat;
    private Float giaBan;
    SanPham() {
        tenSanPham = "";
        motaSanPham = "";
        nhaSanXuat = "";
        giaBan = 0.0f;
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

    public SanPham(String tenSanPham, String motaSanPham,
                   String nhaSanXuat, Float giaBan) {
        this.tenSanPham = tenSanPham;
        this.motaSanPham = motaSanPham;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSanPham='" + tenSanPham + '\'' +
                ", motaSanPham='" + motaSanPham + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                ", giaBan=" + giaBan +
                '}';
    }
    public void nhapThongTin() {
        System.out.println("Ten san pham");
        this.tenSanPham = (new Scanner(System.in)).nextLine();
        System.out.println("Mo ta san pham: ");
        this.motaSanPham = (new Scanner(System.in)).nextLine();
        System.out.println("Nhap ten nha san xuat: ");
        this.nhaSanXuat = (new Scanner(System.in)).nextLine();
        System.out.println("Nhap gia ban:  ");
        this.giaBan = (new Scanner(System.in)).nextFloat();
    }
}
