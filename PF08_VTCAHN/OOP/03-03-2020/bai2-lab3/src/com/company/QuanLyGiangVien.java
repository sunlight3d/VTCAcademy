package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class QuanLyGiangVien {
    private ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public void themGiangVien() {
        System.out.println("Ban nhap may giang vien :");
        int soGiangVien = scanner.nextInt();
        for(int i = 0; i < soGiangVien; i++) {
            //Phai hoi xem nhap giang vien loai gi?
            System.out.println("Giang vien loai gi(0: co huu, 1: thinh giang)");
            KieuGiangVien kieuGiangVien = scanner.nextInt() == 0 ? KieuGiangVien.GIANG_VIEN_CO_HUU :
                                                                    KieuGiangVien.GIANG_VIEN_THINH_GIANG;
            if(kieuGiangVien == KieuGiangVien.GIANG_VIEN_CO_HUU) {
                GiangVienCoHuu giangVienCoHuu = new GiangVienCoHuu();
                giangVienCoHuu.input();
                this.danhSachGiangVien.add(giangVienCoHuu);
            } else if(kieuGiangVien == KieuGiangVien.GIANG_VIEN_THINH_GIANG){
                GiangVienThinhGiang giangVienThinhGiang = new GiangVienThinhGiang();
                giangVienThinhGiang.input();
                this.danhSachGiangVien.add(giangVienThinhGiang);
            }
        }
    }
    public void hienThongTinDanhSachGiangVien() {
        this.danhSachGiangVien.forEach(giangVien -> {
            System.out.println(giangVien);
        });
    }
    public void xoaGiangVien() {
        System.out.println("Nhap ten giang vien can xoa : ");
        String tenGiangVienCanXoa = scanner.nextLine();
        //Bai hom no dung filter, bai nay minh dung removeIf, ket qua nhu nhau,
        //Cac ban ve thu kiem tra lai
        Boolean result = this.danhSachGiangVien.removeIf(giangVien
                -> giangVien.getHoTen().equalsIgnoreCase(tenGiangVienCanXoa));
        if(result == true) {
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Ko tim thay ban ghi de xoa");
        }
    }
    public void traCuuTheoTenHocHamHocVi() {
        System.out.println("Nhap cac thong tin sau de tra cuu: ");
        System.out.println("Ten giang vien: ");
        String tenGiangVien = scanner.nextLine();
        System.out.println("Hoc ham: ");
        String hocHam = scanner.nextLine();
        System.out.println("Hoc vi: ");
        String hocVi = scanner.nextLine();
        //Lay ra danh sasch nhung nguoi thoa man ca 3 dieu kien neu tren
        ArrayList<GiangVien> ketqua =  (ArrayList<GiangVien>)(this.danhSachGiangVien.stream().filter(giangVien -> {
            return giangVien.getHoTen().equalsIgnoreCase(tenGiangVien) &&
                    giangVien.getHocHam().equalsIgnoreCase(hocHam) &&
                    giangVien.getHocVi().equalsIgnoreCase(hocVi);
        }).collect(Collectors.toList()));
        ketqua.forEach(giangVien -> {
            System.out.println(giangVien.toString());
        });
    }
    public void nhapSoGioLamViecTinhLuong() {
        System.out.println("Nhap cac thong tin sau de tinh luong cho 1 giang vien ");
        System.out.println("Ten giang vien: ");
        String tenGiangVien = scanner.nextLine();
        //1.Tim ra giang vien
        ArrayList<GiangVien> ketqua =  (ArrayList<GiangVien>)(this.danhSachGiangVien
                .stream()
                .filter(giangVien -> giangVien.getHoTen().equalsIgnoreCase(tenGiangVien))
                .collect(Collectors.toList()));
        if(ketqua.size() == 0) {
            System.out.println("Ko tim thay giang vien de tinh luong");
        } else  {
            System.out.println("So gio lam viec vua giang vien nay: ");
            GiangVien giangVien = ketqua.get(0);
            giangVien.setSoGioLam(scanner.nextDouble());
            if(giangVien instanceof GiangVienThinhGiang) {
                System.out.println("Giang vien thinh giang, tien luong = ");
                System.out.println(((GiangVienThinhGiang) giangVien).tinhLuong());
            } else if(giangVien instanceof GiangVienCoHuu){
                System.out.println("Giang vien cohuu, tien luong = ");
                System.out.println(((GiangVienCoHuu) giangVien).tinhLuong());
            }

        }
    }
}
