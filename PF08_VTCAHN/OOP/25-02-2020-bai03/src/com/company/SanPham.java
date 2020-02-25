package com.company;

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

    }
}
