package com.lab2.bai03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLySanPham {
    private ArrayList<SanPham> danhSachSanPham = new ArrayList<SanPham>();
    private Scanner getScanner() {
        return new Scanner(System.in);
    }
    public void nhapSanPhamVaoDanhSach() {
        //Cho phep nhap tu ban phim
        System.out.println("Ban nhap bao nhieu san pham : ");
        Integer soSanPham = this.getScanner().nextInt();
        for(int i = 0 ; i < soSanPham; i++) {
            //Van de bai toan: san pham co 2 loai
            System.out.println("Ban nhap sach(1) hay bang dia(2)");
            Integer type = getScanner().nextInt();
            if(type == 1) {
                Sach sach = new Sach();
                sach.input();
                danhSachSanPham.add(sach);
            } else if(type == 2) {
                BangDia bangDia = new BangDia();
                bangDia.input();
                danhSachSanPham.add(bangDia);
            }else {
                System.err.println("Ban phai nhap 1 hoac 2");
                break;
            }
        }
    }
    public void xoaSanPhamKhoiDanhSach() {
        System.out.println("Nhap ma san pham can xoa : ");
        String maSanPham = getScanner().nextLine();
        int firstSize = this.danhSachSanPham.size();
        this.danhSachSanPham.removeIf(tungSanPham -> tungSanPham.getMaSanPham().equalsIgnoreCase(maSanPham));
        if(this.danhSachSanPham.size() < firstSize) {
            System.out.println("San pham xoa thanh cong");
        }
    }
    public void xuatThongTinSanPham() {
        int i = 0;
        for (SanPham sanPham: this.danhSachSanPham) {
            i++;
            System.out.println("San pham thu "+i + " : ");
            System.out.println(sanPham instanceof Sach
                                ? ((Sach)sanPham).toString()
                                    : ((BangDia)sanPham).toString());
        }
    }
    public void timKiemThongTinSanPham() {
        //Tim kiem theo khoang gia
        System.out.println("Nhap gia MIN : ");
        Float minPrice = getScanner().nextFloat();
        System.out.println("Nhap gia MAX :");
        Float maxPrice = getScanner().nextFloat();
        //Tim danh sach ket qua nhung san pham trong khoang min, max
        ArrayList<SanPham> ketQua = new ArrayList<>();
        //cach 1: cach co dien
        /*
        for (SanPham sanPham: this.danhSachSanPham) {
            if(sanPham.getGiaBan() >= minPrice && sanPham.getGiaBan() <= maxPrice) {
                ketQua.add(sanPham);
            }
        }
        */

        //cach 2: dung ham filter, nhanh hon
        ketQua =  (ArrayList<SanPham>) this.danhSachSanPham.stream()
                .filter(sanPham -> sanPham.getGiaBan() >= minPrice && sanPham.getGiaBan() <= maxPrice)
        .collect(Collectors.toList());
        System.out.println("Danh sach san pham sau khi tim kiem : ");
        int i = 0;
        for (SanPham sanPham: ketQua) {
            i++;
            System.out.println("San pham thu "+i + " : "+sanPham.toString());
        }
    }
    //Neu ko co public, nghia la "default" => chi duoc phep truy cap ben trong package
    public void sapXepSanPhamTheoGia() {
        this.danhSachSanPham.sort((sanpham1, sanpham2) -> {
            return sanpham1.getGiaBan().compareTo(sanpham2.getGiaBan());
        });
    }
    public void capNhatThongTinSanPham() {
        System.out.println("Nhap ma san pham cap nhat: ");
        String maSanPham = getScanner().nextLine();
        ArrayList<SanPham> ketQua =  (ArrayList<SanPham>) this.danhSachSanPham.stream()
                .filter(sanPham -> sanPham.getMaSanPham().equalsIgnoreCase(maSanPham))
                .collect(Collectors.toList());
        if(ketQua.size() == 0) {
            System.err.println("Ko tim thay san pham voi ma : "+maSanPham);
        } else {
            SanPham sanPham = ketQua.get(0);
            sanPham.isUpdate = true;
            sanPham.input();
        }
    }
}
