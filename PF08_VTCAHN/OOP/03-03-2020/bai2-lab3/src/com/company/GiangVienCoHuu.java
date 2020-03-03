package com.company;

public class GiangVienCoHuu extends GiangVien implements IGiangVien {
    private Double luongCoBan;
    private Double heSoLuong;

    @Override
    public String toString() {
        return super.toString() +
                "luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Luong co ban: ");
        this.luongCoBan = scanner.nextDouble();

        System.out.println("He so luong: ");
        this.heSoLuong = scanner.nextDouble();
    }

    @Override
    public Double tinhLuong() {
        return super.getSoGioLam() * 90_000 + luongCoBan*heSoLuong;
    }

    public Double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
