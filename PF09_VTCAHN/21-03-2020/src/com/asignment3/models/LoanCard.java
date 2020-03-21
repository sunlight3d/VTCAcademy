package com.asignment3.models;

import com.asignment3.Helper;
import com.asignment3.controllers.BookManagement;
import com.asignment3.controllers.MemberCardManagement;

import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LoanCard extends Model {
    public MemberCardManagement memberCardManagement;
    private Date ngayMuon;
    private Date ngayTra;
    private String mathe = "";
    private String maTheThuVien = "";
    private String tenSach = "";
    private String maSach = "";

    private Boolean isValidate = false;
    public BookManagement bookManagement;
    public Boolean getValidate() {
        return isValidate;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getMathe() {
        return mathe;
    }

    public void setMathe(String mathe) {
        this.mathe = mathe;
    }

    public String getMaTheThuVien() {
        return maTheThuVien;
    }
    public MemberCard getMemberCard() {
        return (memberCardManagement.getCards()
                .stream().filter(memberCard -> getMaTheThuVien().equalsIgnoreCase(maTheThuVien))
                .collect(Collectors.toList())).get(0);
    }

    public void setMaTheThuVien(String maTheThuVien) {
        this.maTheThuVien = maTheThuVien;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setValidate(Boolean validate) {
        isValidate = validate;
    }

    @Override
    public void input() {
        System.out.println("Nhap ma the");
        String mathe = getScanner().nextLine();

        System.out.println("Nhap ma the thu vien");
        String matheThuVien = getScanner().nextLine();

        System.out.println("Nhap ten sach : ");
        String tenSach = getScanner().nextLine();

        System.out.println("Nhap ma sach : ");
        String maSach = getScanner().nextLine();

        System.out.println();

        if(this.memberCardManagement.kiemTraTonTaiMaThe(matheThuVien) == false) {
            System.out.println("Ko tim thay ma the");
            isValidate = false;
            return;
        }
        //1.validate sach co ton tai hay ko?

        if(this.bookManagement.kiemTraConSachKhong(maSach, tenSach) == false) {
            //Kiem tra sach ton tai + so luong > 0
            //2.validate so luong sach > 0 hay ko
            System.out.println("Ko tim thay sach voi maSach:"+maSach + "va tensach : "+tenSach);
            isValidate = false;
            return;
        }
        if(this.bookManagement.muonSach(maSach) == false) {
            isValidate = false;
        }

        isValidate = true;
    }
    @Override
    public void update() {

    }

    @Override
    public String toString() {
        return String.format("%8s", mathe) +
                String.format("%8s", maTheThuVien) +
                String.format("%8s", Helper.getHourMinuteFromDate(ngayMuon)) +
                String.format("%8s", Helper.getHourMinuteFromDate(ngayTra)) +
                String.format("%8s", tenSach);
    }
}
