package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Viet class mai chan roi, viet menu
        int choice = 0;
        System.out.println("1. Them san pham ");
        System.out.println("2. Xoa san pham ");
        //....
        System.out.println("7. Thoat ");
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        //Bay gio test thu cai menu nay !
        while (choice != 7) {
            System.out.println("Moi ban chon 1 - 7:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Them san pham");
                    quanLySanPham.nhapSanPhamVaoDanhSach();
                    break;
                case 2:
                    System.out.println("Xoa san pham");
                    quanLySanPham.xoaSanPham();
                    break;
                case 3:
                    System.out.println("Cap nhat san pham");
                    quanLySanPham.capNhatSanPham();
                    break;
                case 4:
                    System.out.println("Tim kiem san pham");
                    quanLySanPham.timKiemSanPham();
                    break;
                case 5:
                    System.out.println("Sap xep san pham");
                    quanLySanPham.sapXepSanPham();
                    break;
                case 6:
                    System.out.println("Xem danh sach san pham");
                    quanLySanPham.xemDanhSach(quanLySanPham.getDanhSachSanPham());
                    break;
                case 7:
                    System.out.println("Thoat");
                    break;
            }
        }
    }
}
