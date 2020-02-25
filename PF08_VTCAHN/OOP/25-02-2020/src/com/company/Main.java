package com.company;

public class Main {

    public static void main(String[] args) {
        //Tao doi tuong va test
        //Tao ra 1 hinh ellipse
        Ellipse hinhElip1 = new Ellipse(10.0, 4.0);
        System.out.println("dien tich hinh elip = ");
        //Khi cac ban in 1 object ra man hinh => tu dong goi ham toString()
        System.out.println(hinhElip1.tinhDienTich());
        System.out.println("chu vi hinh elip = ");
        System.out.println(hinhElip1.tinhChuVi());
        //Ellipse@6acbcfc0 la dia chi(HEXA, he 16, 0->f) bo nho(memory address) cua doi tuong hinhElip1
        Circle circleA = new Circle(13.0);
        System.out.println(circleA);
        //Minh chi muon in "ban kinh duong tron" thi lam the nao?
        //override phuong thuc toString cua Circle
        //Test phuong thuc cua Circle
        System.out.println("Chu vi hinh tron = ");
        System.out.println(circleA.tinhChuVi());
        System.out.println("Dien tich hinh tron = ");
        System.out.println(circleA.tinhDienTich());
        //Tao ra mot hinh chu nhat
        HinhChuNhat hinhChuNhatABCD = new HinhChuNhat(10, 2);
        System.out.println("Dien tich hinh chu nhat : ");
        System.out.println(hinhChuNhatABCD.tinhDienTich());

        System.out.println("Chu vi hinh chu nhat : ");
        System.out.println(hinhChuNhatABCD.tinhChuVi());

    }
}
