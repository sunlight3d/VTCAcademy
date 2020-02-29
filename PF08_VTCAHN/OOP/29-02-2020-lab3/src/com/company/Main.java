package com.company;

public class Main {

    public static void main(String[] args) {
	    //Tao ra 4 hinh: chu nhat, ellipse, tam giac, hinh tron
        HinhChuNhat hinhChuNhatA = new HinhChuNhat("hcnA",
                10.0,
                20.0);
        Ellipse ellipseB = new Ellipse("ellipseB", 10.0, 5.0);
        TamGiac tamGiacC = new TamGiac("tamgiacC", 2.0,3.0,4.0);
        HinhTron hinhTronD = new HinhTron(12.0);
        hinhTronD.setTen("hinhtronD");
        //Them vao danh sach
        //Tao ra 1 doi tuong quan ly hinh
        QLHinh qlHinh = new QLHinh();
        qlHinh.themHinhVaoDanhSach(hinhChuNhatA);
        qlHinh.themHinhVaoDanhSach(ellipseB);
        qlHinh.themHinhVaoDanhSach(tamGiacC);
        qlHinh.themHinhVaoDanhSach(hinhTronD);
        //Chuc nang xoa hinh khoi danh sach
        System.out.println("Truoc khi xoa");
        qlHinh.hienThiThongTinCacHinh();
//        qlHinh.xoaHinhKhoiDanhSach("ellipseB");
//        System.out.println("Sau khi xoa");
        System.out.println("Sau khi sap xep: ");
        //qlHinh.sapXepTangDanTheoDienTich();
        qlHinh.sapXepGiamDanTheoChuVi();
        qlHinh.hienThiThongTinCacHinh();
    }
}
