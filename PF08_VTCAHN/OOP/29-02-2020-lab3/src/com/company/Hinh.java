package com.company;

public abstract class Hinh {
    private String ten;
    Hinh(String ten) {
        this.ten = ten;
    }
    public abstract Double tinhDienTich();
    public abstract Double tinhChuVi();

    @Override
    public String toString() {
        return "Hinh {" +
                "ten='" + ten + '\'' +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
