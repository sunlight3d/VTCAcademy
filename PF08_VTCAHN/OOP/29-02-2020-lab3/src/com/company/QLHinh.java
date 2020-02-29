package com.company;

import java.util.ArrayList;

public class QLHinh {
    private ArrayList<Hinh> danhSachHinh = new ArrayList<Hinh>();
    public void themHinhVaoDanhSach(Hinh hinhMoi) {
        danhSachHinh.add(hinhMoi);//Them vao danh sach
    }
    public void xoaHinhKhoiDanhSach(String tenHinhCanXoa) {
        danhSachHinh.removeIf(hinh->{
            return hinh.getTen().equals(tenHinhCanXoa);
        });
    }
    public void hienThiThongTinCacHinh() {
        for(Hinh hinh: danhSachHinh) {
            //Loc tung hinh trong danh sach
            System.out.println(hinh);
            System.out.println("Chu vi: "+hinh.tinhChuVi());
            System.out.println("Dien tich: "+hinh.tinhDienTich());
        }
    }
    public void sapXepTangDanTheoDienTich() {
        this.danhSachHinh.sort((hinh1, hinh2)->{
            return hinh1.tinhDienTich().compareTo(hinh2.tinhDienTich());
        });
    }
    public void sapXepGiamDanTheoChuVi() {
        this.danhSachHinh.sort((hinh1, hinh2)
                ->hinh2.tinhChuVi().compareTo(hinh1.tinhChuVi()));
    }
    //Thu test cac chuc  nang ?
}
