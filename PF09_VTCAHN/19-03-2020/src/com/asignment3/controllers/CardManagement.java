package com.asignment3.controllers;

import com.asignment3.Main;

import java.util.Scanner;

public class CardManagement implements IManagement {
    @Override
    public void showMenu() {
        int choice = -1;
        while(choice != 0) {
            System.out.println("Quản lý thẻ thư viện");
            System.out.println("----------------------------------------");
            System.out.println("1. Xem danh sách thẻ thư viện");
            System.out.println("2. Cập nhật thông tin thẻ");
            System.out.println("3. Thêm mới một thẻ");
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

    }

    @Override
    public void update() {

    }

    @Override
    public void showAll() {

    }

    @Override
    public Scanner getScanner() {
        return null;
    }
}
