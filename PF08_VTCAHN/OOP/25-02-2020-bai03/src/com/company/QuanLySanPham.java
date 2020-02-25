package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySanPham {
    //Xây dựng lớp cho phép quản lý danh sách sản phẩm tại công ty
    private ArrayList<SanPham> danhSachSanPham = new ArrayList<SanPham>();
    //Chu y ArrayList<Sach> ko chua duoc ArrayList<BangDia>
    //ArrayList cua SanPham thi chua duoc BangDia VA Sach
    //Vi: SanPham la CHA cua BangDia va Sach
    //ai nho Linked List trong C/C++ ?
    //la danh sach cac Node, co cac con tro *next, *back
    //Nhung trong Java, ta quen *next, *back
    public void nhapSanPhamVaoDanhSach() {
        System.out.println("Ban nhap Sach(sach) hay Bang Dia(bangdia)");
        //Bai nay co nhieu cach de lam, day la 1 trong cac cach
        String kieuSanPham = (new Scanner(System.in)).next();
        System.out.println("Nhap so san pham");
        Integer soSanPham = (new Scanner(System.in)).nextInt();

        if(kieuSanPham.equals("sach")) {
            //Nhap sach
            for(int i = 0; i < soSanPham; i++) {
                //Tao ra tung quyen sach
                Sach sach = new Sach();
                sach.nhapThongTin(); //cong viec nhap thong tin 1 quyen sach
                //la cong viec(method) cua class Sach

            }
        } else if(kieuSanPham.equals("bangdia")) {
            //Nhap bang dia
        }
        //equals va ==
        //equals: so sanh gia tri
        //== so sanh ca gia tri va "dia chi"
        //Neu muon ko phan biet hoa/thuong thi lam ntn ?
        //kieuSanPham.toUpperCase().equals("SACH")
        //kieuSanPham.equalsIgnoreCase("sach")
    }

}
