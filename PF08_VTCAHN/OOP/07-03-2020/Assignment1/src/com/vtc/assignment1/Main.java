package com.vtc.assignment1;

import controllers.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Assignement 1");
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        int choice = -1;
        while (choice != 0) {
            // 1 lop hoc co nhieu sinh vien, mot sinh vien co nhieu diem thi
            System.out.println("1.Quản lý danh sách sinh viên");
            System.out.println("2.Quản lý lớp học");
            System.out.println("3.Quản lý điểm thi");
            System.out.println("0.Thoát");
            System.out.print("Mời bạn chọn(0-3) : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManagement.showMenu();
                    break;
                case 2:
                    System.out.println("Ban chon 2");
                    break;
                case 3:
                    System.out.println("Ban chon 3");
                    break;
            }
        }
        System.out.println("Chương trình đã kết thúc");
    }
}
