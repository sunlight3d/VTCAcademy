package lab3.bai01;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHinh {
    private ArrayList<Hinh> danhSachHinh = new ArrayList<>();
    private Scanner getScanner() {
        return new Scanner(System.in);
    }
    public void showMenu() {
        int choice = -1;
        while (choice != 7) {
            System.out.println("1.Thêm hình vào danh sách.");
            System.out.println("2.Xoá hình khỏi danh sách.");
            System.out.println("3.Hiển thị thông tin các hình trong danh sách");
            System.out.println("4.Lấy danh sách các hình của một loại cụ thể (hình chữ nhật, hình vuông, …)");
            System.out.println("5.Sắp xếp danh sách tăng dần theo diện tích.");
            System.out.println("6.Sắp xếp giảm dần theo chu vi.");
            System.out.println("7-Thoat");
            System.out.println("Moi ban lua chon(1-7)");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1 :
                    this.themHinhVaoDanhSach();
                    break;
                case 2 :
                    this.xoaHinhKhoiDanhSach();
                    break;
                case 3 :
                    this.hienThiThongTinCacHinh();
                    break;
                case 4 :
                    this.hienThiHinhCuThe();
                    break;
                case 5 :
                    this.sapXepTangDanTheoDienTich();
                    break;
                case 6 :
                    this.sapXepGiamDanTheoDienTich();
                    break;
            }
        }
    }

    public void themHinhVaoDanhSach() {

    }
    public void xoaHinhKhoiDanhSach() {

    }
    public void hienThiThongTinCacHinh() {

    }
    public void hienThiHinhCuThe() {

    }
    public void sapXepTangDanTheoDienTich() {

    }
    public void sapXepGiamDanTheoDienTich() {

    }
}
