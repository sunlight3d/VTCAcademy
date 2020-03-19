package com.asignment3;

import com.asignment3.controllers.BookManagement;
import com.asignment3.controllers.MemberCardManagement;

import java.util.Scanner;

public class Main {
    private static Scanner getScanner(){
        return new Scanner(System.in);
    }
    //tranh thu hoc them: kiem tra dinh dang cmnd, dinh dan id cua sa
    public static void main(String[] args) {
        int choice = -1;
        BookManagement bookManagement = new BookManagement();
        MemberCardManagement memberCardManagement = new MemberCardManagement();
        bookManagement.memberCardManagement = memberCardManagement;
        memberCardManagement.bookManagement = bookManagement;
        //tuong tac giua cac management voi nhau
        //cac ham: book voi masach abc  da ton tai chua
        //phuogn thuc cua management
        while(choice != 0) {
            System.out.println("--- Chào mừng đến với thư viện VTCA ---");
            System.out.println("----------------------------------------");
            System.out.println("1. Quản lý sách");
            System.out.println("2. Quản lý thẻ thư viện");
            System.out.println("3. Quản lý thẻ mượn sách");
            System.out.println("0. Thoát");
            System.out.println("----------------------------------------");
            System.out.println("Mời bạn lựa chọn(0 - 3)");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1:
                    bookManagement.showMenu();
                    Main.clearScreen();
                    break;
                case 2:
                    memberCardManagement.showMenu();
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
        System.out.println("The End");
    }
    public static void clearScreen() {
        try {
            String osName = System.getProperty("os.name").toLowerCase();
            if(osName.indexOf("win") >= 0) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("sh", "", "clear").inheritIO().start().waitFor();
            }
        }catch (Exception e) {
            System.err.println("Lỗi xóa màn hình: "+e.toString());
        }

    }
}
