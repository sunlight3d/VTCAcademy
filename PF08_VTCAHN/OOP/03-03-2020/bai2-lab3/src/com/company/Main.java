package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //RegexExample regexExample = new RegexExample();
	    //regexExample.checkEmailInAString();
        //regexExample.getXYFromText();
        System.out.println("Chuong trinh quan ly giang vien");
        System.out.println("1.Them giang vien vao danh sach");
        System.out.println("2.Xoa giang vien");
        System.out.println("3.Tra cuu thong tin theo ten, hoc ham, hoc vi");
        System.out.println("4.Nhap so gio lam viec, tinh luong");
        System.out.println("5.Hien thong tin danh sach giang vien");
        System.out.println("6.Thoat chuong trinh");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        QuanLyGiangVien quanLyGiangVien = new QuanLyGiangVien();
        while (choice != 6) {
            System.out.print("Moi ban lua chon(1-5)");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    quanLyGiangVien.themGiangVien();
                    break;
                case 2:
                    quanLyGiangVien.xoaGiangVien();
                    break;
                case 3:
                    quanLyGiangVien.traCuuTheoTenHocHamHocVi();
                    break;
                case 4:
                    quanLyGiangVien.nhapSoGioLamViecTinhLuong();
                    break;
                case 5:
                    quanLyGiangVien.hienThongTinDanhSachGiangVien();
                    break;
            }
        }
    }
}
