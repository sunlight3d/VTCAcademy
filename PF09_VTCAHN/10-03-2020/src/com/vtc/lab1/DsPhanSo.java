package com.vtc.lab1;

import java.util.ArrayList;

public class DsPhanSo {
    //Generics class = class co the chua nhieu kieu du lieu khac nhau
    //so do UML = Unified Modelling Language , mo ta quan he giua cac thuc the(entity relationship)
    private ArrayList<PhanSo> danhSachPhanSo = new ArrayList<>();
    //1 thuoc tinh nen khoi tao gia tri ban dau
    //sau nay khi goi den phuong thuc cua doi tuong nay se ko bi crash(exception)
    //chu y: viec nay ko phai luc nao cung dung
    //vi: co 1 so thuoc tinh chiem nhieu bo nho(eager) => ko nen khoi tao, khi dung den moi khoi tao(lazy)
    public void themPhanSo(PhanSo phanSo) {
        this.danhSachPhanSo.add(phanSo);
    }
    public void xoaPhanSo(PhanSo phanSo) {
        this.danhSachPhanSo.remove(phanSo);
    }
    public void sapXep(){
        this.danhSachPhanSo.sort((phanSo1, phanSo2) -> {
            return  phanSo2.soSanh(phanSo1); //dam bao dau ra -1 0 1
        });
        //trong C, cai nay goi la con tro ham
    }
    public void hienThi() {
        //cach co dien, mat cong khai bai i, so sanh, tinh tong i++
        /*
        for(int i = 0; i < this.danhSachPhanSo.size(); i++) {
            PhanSo phanSo = this.danhSachPhanSo.get(i);
            phanSo.hienThi();
        }
         */
        //cach 2: nhanh hon
        int i = 1;
        for (PhanSo phanSo: this.danhSachPhanSo) {
            System.out.println("Phan so thu : "+i);
            phanSo.hienThi();//chay nhanh hon
        }
    }
    public PhanSo tinhTong() {
        PhanSo phanSoBanDau = new PhanSo(0, 1);
        for (PhanSo phanSo: this.danhSachPhanSo) {
            phanSoBanDau = phanSoBanDau.cong(phanSo);
        }
        return phanSoBanDau;
    }

}
