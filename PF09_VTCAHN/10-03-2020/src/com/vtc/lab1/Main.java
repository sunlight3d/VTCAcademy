package com.vtc.lab1;

public class Main {
    //args = arguments = parameters
    public static void main(String[] args) {
        System.out.println("Hello");
        //Tao du lieu fake
        PhanSo phanSo1 = new PhanSo(1, 1);
        PhanSo phanSo2 = new PhanSo(1, 3);
        PhanSo phanSo3 = new PhanSo(2, 1);
        DsPhanSo dsPhanSo = new DsPhanSo();
        dsPhanSo.themPhanSo(phanSo1);
        dsPhanSo.themPhanSo(phanSo2);
        dsPhanSo.themPhanSo(phanSo3);
        dsPhanSo.sapXep();
        dsPhanSo.hienThi();

    }
}
