package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLySanPham {
    //Xây dựng lớp cho phép quản lý danh sách sản phẩm tại công ty
    private ArrayList<SanPham> danhSachSanPham = new ArrayList<SanPham>();
    //vi SanPham la cha cua Sach va BangDia nen danhSachSanPham chua duoc ca doi tuong
    //BangDia va Sach
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
                //Them san pham vao danh sach
               this.danhSachSanPham.add(sach);
            }
        } else if(kieuSanPham.equals("bangdia")) {
            for(int i = 0; i < soSanPham; i++) {
                //Nhap bang dia
                BangDia bangDia = new BangDia();
                bangDia.nhapThongTin();
                this.danhSachSanPham.add(bangDia);
            }
        }
        //equals va ==
        //equals: so sanh gia tri
        //== so sanh ca gia tri va "dia chi"
        //Neu muon ko phan biet hoa/thuong thi lam ntn ?
        //kieuSanPham.toUpperCase().equals("SACH")
        //kieuSanPham.equalsIgnoreCase("sach")
        System.out.println("haha");
    }
    public void xoaSanPham() {
        //xoa san pham nao ?
        //Chang han "xoa theo ten san pham"
        System.out.println("Nhap ten san pham can xoa :");
        String tenSanPhamCanXoa = (new Scanner(System.in)).nextLine();
        this.danhSachSanPham = (ArrayList<SanPham>) this.danhSachSanPham.stream()
                .filter(sanPham -> !sanPham.getTenSanPham().equals(tenSanPhamCanXoa))
                .collect(Collectors.toList());
        //Ben trong ham filter la 1 "HAMMMMM"= function, tra ve True/False
        //cho minh biet "DIEU KIEN LOC"
    }
    public void capNhatSanPham() {
        System.out.println("Nhap ten san pham can cap nhat :");
        String tenSanPhamCanUpdate = (new Scanner(System.in)).nextLine();
        Boolean timThaySanPham = false;
        for(SanPham sanPham: this.danhSachSanPham) {
            if(sanPham.getTenSanPham().equals(tenSanPhamCanUpdate)) {
                timThaySanPham = true;
                System.out.println("Mo ta san pham: ");
                sanPham.setMotaSanPham(new Scanner(System.in).nextLine());

                System.out.println("Nha san xuat: ");
                sanPham.setNhaSanXuat(new Scanner(System.in).nextLine());
                //Cac ban lam tuong tu cac truong khac
                //San pham luc la Sach, luc lai lla BangDia ?
                if(sanPham instanceof Sach) {
                    System.out.println("Nhap so trang :");
                    ((Sach)sanPham).setSoTrang(new Scanner(System.in).nextInt());
                } else if(sanPham instanceof BangDia) {
                    System.out.println("Nhap thoi gian phat :");
                    ((BangDia)sanPham).setThoiGianPhat(new Scanner(System.in).nextFloat());
                }
            }
        }
        if(timThaySanPham == false){
            System.out.println("Ko tim thay san pham");
        }
        System.out.println("hehe");
    }
    //Tim kiem san pham, gia su tim san pham co gia trong khoang tu 1 den 5 dong ?
    public void timKiemSanPham() {
        System.out.println("Nhap vao khoang gia de tim kiem");
        System.out.println("Gia MIN: ");
        Float giaMin = (new Scanner(System.in).nextFloat());
        Float giaMax = (new Scanner(System.in).nextFloat());
        ArrayList<SanPham> ketQua = (ArrayList<SanPham>) this.danhSachSanPham.stream()
                .filter(sanPham -> {
                    return sanPham.getGiaBan() >= giaMin && sanPham.getGiaBan() <= giaMax;
                })
                .collect(Collectors.toList());
        this.xemDanhSach(ketQua);
    }
    public void xemDanhSach(ArrayList<SanPham> danhsach) {
        for(SanPham sanPham: danhsach) {
            System.out.println(sanPham);//viet ham toString cua "sanPham" ?
        }
    }

    public ArrayList<SanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(ArrayList<SanPham> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
    public void sapXepSanPham() {
        //sap xep trong C = on lai
        //lam 2 vong for, i tu ) -> N-1, j tu i + 1 den N
        //neu gia tri tai j > tai j => doi cho ....

        this.danhSachSanPham.sort((sanpham1, sanpham2) ->
                sanpham2.getGiaBan().compareTo(sanpham1.getGiaBan()));
        System.out.println("Haha");
    }
}
