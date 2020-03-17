package lab3.bai02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyGiangVien {
    private int choice  = -1;
    private ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
    private Scanner getScanner() {
        return new Scanner(System.in);
    }
    public void showMenu() {
        while (choice != 5) {
            System.out.println("1.Thêm giảng viên vào danh sách.");
            System.out.println("2.Xoá giảng viên.");
            System.out.println("3.Tra cứu thông tin giảng viên theo tên, học hàm, học vị.");
            System.out.println("4.Tính tiền lương, người dùng cần nhập số giờ làm việc của từng giảng viên");
            System.out.println("5.Thoat");
            System.out.println("Moi ban chon (1 - 5)");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1:
                    this.themGiangVienVaoDanhSach();
                    break;
                case 2:
                    this.xoaGiangVien();
                    break;
                case 3:
                    this.traCuuThongTinGiangVien();
                    break;
                case 4:
                    this.tinhTienLuong();
                    break;
                default:
                    break;
            }
        }
    }
    private void themGiangVienVaoDanhSach() {
        System.out.println("Ban them may giang vien ?");
        int soGiangVien = getScanner().nextInt();
        int i = 0;
        for (i = 0; i < soGiangVien; i++) {
            //Nhap thong tin la cong viec cua tung giang vien
            System.out.println("Giang vien thu "+i);
            System.out.println("Giang vien thinh giang(1), co huu(0)");
            int loaiGiangVien = getScanner().nextInt();
            if(loaiGiangVien == GiangVien.GIANG_VIEN_CO_HUU) {
                GiangVienCoHuu giangVienCoHuu = new GiangVienCoHuu();
                giangVienCoHuu.input();
                danhSachGiangVien.add(giangVienCoHuu);
            } else if(loaiGiangVien == GiangVien.GIANG_VIEN_THINH_GIANG) {
                GiangVienThinhGiang giangVienThinhGiang = new GiangVienThinhGiang();
                giangVienThinhGiang.input();
                danhSachGiangVien.add(giangVienThinhGiang);
            }
        }
    }
    private void xoaGiangVien() {
        System.out.println("Nhap ten giang Vien can xoa :");
        String tenGiangVien = getScanner().nextLine();
        this.danhSachGiangVien.removeIf(giangVien -> tenGiangVien.equalsIgnoreCase(giangVien.getHoten()));
    }
    private void traCuuThongTinGiangVien() {
        System.out.println("Nhap ten giang Vien tra cuu :");
        String tenGiangVien = getScanner().nextLine();
        ArrayList<GiangVien> ketQua = (ArrayList<GiangVien>)this.danhSachGiangVien
                .stream()
                .filter(giangVien -> tenGiangVien.equalsIgnoreCase(giangVien.getHoten()))
                .collect(Collectors.toList());
        //Hien ket qua
        if(ketQua.size() == 0) {
            System.out.println("Ko tim thay giang vien co ten la "+tenGiangVien);
        } else {
            for(GiangVien giangvien: ketQua) {
                System.out.println(giangvien.toString());
            }
        }
    }
    private void tinhTienLuong() {
        System.out.println("Nhap ten giang Vien can tinh luong :");
        String tenGiangVien = getScanner().nextLine();
        ArrayList<GiangVien> ketQua = (ArrayList<GiangVien>)this.danhSachGiangVien
                .stream()
                .filter(giangVien -> tenGiangVien.equalsIgnoreCase(giangVien.getHoten()))
                .collect(Collectors.toList());
        //Hien ket qua
        if(ketQua.size() == 0) {
            System.out.println("Ko tim thay giang vien co ten la "+tenGiangVien);
        } else {
            for(GiangVien giangvien: ketQua) {
                System.out.println("Nhap so gio lam viec");
                giangvien.setSoGioLam(getScanner().nextDouble());
                System.out.println("Luong giang vien nay la :" + giangvien.tinhLuong());
            }
            sapXepLuongGiamDan();
            hienThiDanhSachGiangVien();
        }
    }

    private void sapXepLuongGiamDan() {
        //sap xep thang vao danh sach cu
        this.danhSachGiangVien.sort((giangVien1, giangVien2) -> giangVien1.tinhLuong().compareTo(giangVien2.tinhLuong()));
    }

    private void hienThiDanhSachGiangVien() {
        for(GiangVien giangvien: danhSachGiangVien) {
            System.out.println(giangvien.toString());
        }
    }
}
