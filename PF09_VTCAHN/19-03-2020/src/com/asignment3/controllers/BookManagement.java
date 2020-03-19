package com.asignment3.controllers;

import com.asignment3.Main;

import java.util.Scanner;

public class BookManagement  implements IManagement{

    @Override
    public void showMenu() {
        int choice = -1;
        while(choice != 0) {
            System.out.println("Quản lý sách");
            System.out.println("----------------------------------------");
            System.out.println("1. Xem danh sách sách");
            System.out.println("2. Cập nhật thông tin sách");
            System.out.println("3. Thêm mới một quyển sách");
            System.out.println("0. Trở về menu chính");
            System.out.println("----------------------------------------");
            System.out.println("Mời bạn lựa chọn(0 - 3)");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ban chon 1");
                    Main.clearScreen();
                    break;
                case 2:
                    System.out.println("Ban chon 2");
                    Main.clearScreen();
                    break;
                case 3:
                    System.out.println("Ban chon 3");
                    Main.clearScreen();
                    break;
                default:
                    break;
            }
        }
    }
    @Override
    public void input() {
        System.out.println("======== Thêm mới một quyển sách ========");
    }

    @Override
    public void update() {

    }

    @Override
    public void showAll() {

    }

    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
