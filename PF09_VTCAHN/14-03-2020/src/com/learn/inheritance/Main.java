package com.learn.inheritance;

import com.lab2.bai01.Ellipse;
import com.lab2.bai01.MyCircle;
import com.lab2.bai02.*;
import com.lab2.bai03.QuanLySanPham;

import java.security.PrivilegedExceptionAction;
import java.util.Scanner;

//Nhan xet: ca 2 class Rectangle va class Circle deu co thuoc tinh giong nhau la name, color
//De cho bai toan don gian hon
//Minh dinh nghia 1 lop cha(parent class = super class) ten la Shape(hinh dang, hinh bat ky)
//chua thong tin name, color
//RAt nhieu vi du khac ve ke thua:
//Vd: Person la cha cua Student
//Hay dung ke thua trong TH nao? minh co nhieu hon 1 lop con(sub class, child class
// //Vi du: minh co class Rectangle, Circle
//Bai toan cua minh chi co Rectangle
//A lop cha, B lop con cua A, C la cua B => chi len ke thua den <= 3
//thuc te chi len ke thua 2 levels
class Main {
    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
    public static void main(String[] args) {
        System.out.println("Tim hieu ve ke thua = inheritance");
        //test
        //Khoi tao 1 doi tuong hinh chu nhat(lop con = child class = sub class)
        Rectangle rectangleA = new Rectangle("hinh A", "red", 10.0, 20.0);
        System.out.println("Detail of Rectangle A  = "+rectangleA.toString());
        rectangleA.doSomething();
        rectangleA.doTaskA();//doTask bi Deprecated, sap sua vut di
        //Bai toan: Minh co project rat to, rat nhieu file goi den ham doTaskA, sua het doTaskA->doTaskB
        //co 1 tieu xao fix nhanh: viet 1 class ke thua tu class Rectangle kia
        //sau do viet 1 ham ten doTAskA, trong ham doTaskA goi den doTaskB
        rectangleA.doTaskB();
        //Tao ra 1 doi tuong Circle
        Cirle c1 = new Cirle("circle A", "blue", 5.0);
        System.out.println("Dien tich hinh tron A = "+c1.getArea());
        System.out.println("Detail of c1 = "+c1.toString());
        System.out.println("Bai 1 - lab 2");
        Ellipse ellipseA = new Ellipse(10.0, 5.0);
        System.out.println("Dien tich ellipse A  =  "+ellipseA.tinhDienTich());
        System.out.println("Chu vi ellipse A  =  "+ellipseA.tinhChuVi());
        MyCircle cirleA = new MyCircle(10.0);
        System.out.println("Thong tin chi tiet circleA = "+cirleA.toString());
        System.out.println("Dien tich hinh tron A : "+cirleA.tinhDienTich());
        System.out.println("Chu vi hinh tron A : "+cirleA.tinhChuVi());
        System.out.println("Bai 2 - lab 2");
        //tao ra 1 doi tuong hinh chu nhat
        HinhChuNhat hinhChuNhatA = new HinhChuNhat(10, 5);
        System.out.println("Dien tich hinh chu nhat A = "+hinhChuNhatA.tinhDienTich());
        System.out.println("Chu vi hinh chu nhat A = "+hinhChuNhatA.tinhChuVi());
        HinhVuong hinhVuongA = new HinhVuong(5);
        System.out.println("Dien tich hinh vuong A = "+hinhVuongA.tinhDienTich());
        System.out.println("Chu vi hinh vuong A = "+hinhVuongA.tinhChuVi());
        TamGiac tamGiacA = new TamGiac(1.0,2.0,3.0);
        System.out.println("Dien tich tam giac A = "+tamGiacA.tinhDienTich());
        System.out.println("Chu vi tam giac A = "+tamGiacA.tinhChuVi());

        TamGiacCan tamGiacB = new TamGiacCan(1.0,3.0);
        System.out.println("Dien tich tam giac B = "+tamGiacB.tinhDienTich());
        System.out.println("Chu vi tam giac B = "+tamGiacB.tinhChuVi());

        TamGiacDeu tamGiacC = new TamGiacDeu(3.0);
        System.out.println("Dien tich tam giac C = "+tamGiacC.tinhDienTich());
        System.out.println("Chu vi tam giac C = "+tamGiacC.tinhChuVi());
        //Tao menu: hay dung trong cac ung dung dang console
        //Neu viet giao dien, co the dung Java Swing va JavaFX
        int choice = -1;
        //1 doi tuong QuanLySanPham co nhieu san pham
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        while (choice != 7) {
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Xoá sản phẩm");
            System.out.println("3.Cập nhật sản phẩm");
            System.out.println("4.Tìm kiếm sản phẩm theo mã sản phẩm, tên sản phẩm hoặc khoảng giá bán.");
            System.out.println("5.Sắp xếp các sản phẩm giảm dần theo giá.");
            System.out.println("6.Xem danh sách sản phẩm.");
            System.out.println("7.Thoát.");
            System.out.println("Ban hay nhap 1 lua chon(1-7) : ");
            choice = getScanner().nextInt();
            //kiem tra dieu kien cac gia tri roi rac => nen dung switch-case

            switch (choice) {
                case 1:
                    quanLySanPham.nhapSanPhamVaoDanhSach();
                    break;
                case 2:
                    quanLySanPham.xoaSanPhamKhoiDanhSach();
                    break;
                case 3:
                    quanLySanPham.capNhatThongTinSanPham();
                    break;
                case 4:
                    quanLySanPham.timKiemThongTinSanPham();
                    break;
                case 5:
                    quanLySanPham.sapXepSanPhamTheoGia();
                    break;
                case 6:
                    quanLySanPham.xuatThongTinSanPham();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Ket thuc chuong trinh");

    }
}
