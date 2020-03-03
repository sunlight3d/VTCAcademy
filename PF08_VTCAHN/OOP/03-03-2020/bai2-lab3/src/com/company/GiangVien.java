package com.company;

import java.util.Date;
import java.util.Scanner;

public class GiangVien {
    private String hoTen;
    private String ngaysinh; //"02-12-1995"
    private String hocHam;
    private String hocVi;
    private String ngayBatDauCongTac;//"02-12-1995"
    private Double soGioLam;

    public Scanner scanner;

    public GiangVien() {
    }
    public void input() {
        System.out.println("Ten giang vien: ");
        this.hoTen = scanner.nextLine();

        System.out.println("Ngay sinh(dd-mm-yyyy): ");
        this.ngaysinh = scanner.nextLine();

        System.out.println("Hoc ham: ");
        this.hocHam = scanner.nextLine();

        System.out.println("Hoc vi: ");
        this.hocVi = scanner.nextLine();

        System.out.println("Ngay bat dau cong tac(dd-mm-yyyy):");
        this.ngayBatDauCongTac = scanner.nextLine();

        System.out.println("So gio lam : ");
        this.soGioLam = scanner.nextDouble();

    }

    @Override
    public String toString() {
        return
                "hoTen='" + hoTen + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", hocHam='" + hocHam + '\'' +
                ", hocVi='" + hocVi + '\'' +
                ", ngayBatDauCongTac='" + ngayBatDauCongTac + '\'' +
                ", soGioLam=" + soGioLam;
    }

    public GiangVien(String hoTen, String ngaysinh, String hocHam,
                     String hocVi, String ngayBatDauCongTac, Double soGioLam) {
        this.hoTen = hoTen;
        this.ngaysinh = ngaysinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDauCongTac = ngayBatDauCongTac;
        this.soGioLam = soGioLam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getNgayBatDauCongTac() {
        return ngayBatDauCongTac;
    }

    public void setNgayBatDauCongTac(String ngayBatDauCongTac) {
        this.ngayBatDauCongTac = ngayBatDauCongTac;
    }

    public Double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(Double soGioLam) {
        this.soGioLam = soGioLam;
    }
}
