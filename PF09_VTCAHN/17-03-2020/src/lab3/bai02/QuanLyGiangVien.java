package lab3.bai02;

import java.util.Scanner;

public class QuanLyGiangVien {
    private int choice  = -1;
    private Scanner getScanner() {
        return new Scanner(System.in);
    }
    public void showMenu() {
        System.out.println("1.Thêm giảng viên vào danh sách.");
        System.out.println("2.Xoá giảng viên.");
        System.out.println("3.Tra cứu thông tin giảng viên theo tên, học hàm, học vị.");
        System.out.println("4.Tính tiền lương, người dùng cần nhập số giờ làm việc của từng giảng viên");
        System.out.println("5.Thoat");
        System.out.println("Moi ban chon (1 - 5)");


    }

}
