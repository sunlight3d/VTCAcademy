package com.asignment3.controllers;

import com.asignment3.Main;
import com.asignment3.models.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookManagement  implements IManagement{
    public MemberCardManagement memberCardManagement;//ko khoi tao
    private ArrayList<Book> books = new ArrayList<>();
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
                    this.showAll();
                    Main.clearScreen();
                    break;
                case 2:
                    this.update();
                    Main.clearScreen();
                    break;
                case 3:
                    this.input();
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
        Boolean continueOrNot = true;
        while(continueOrNot == true) {
            Book newBook = new Book();
            newBook.input();
            books.add(newBook);
            System.out.println("Ban co muon tiep tuc(Y/N):");
            continueOrNot = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        }
    }

    @Override
    public void update() {
        System.out.println("======== Cập nhật thông tin sách ========");
        Boolean continueOrNot = true;
        while(continueOrNot == true) {
            //Má sách bắt đầu bằng chữ B, sau đó là 2 số => regex
            System.out.println("- Nhập mã sách:");
            final String maSach = getScanner().nextLine();
            ArrayList<Book> result = (ArrayList<Book>)this.books
                    .stream()
                    .filter(eachBook -> eachBook.getMaSach()
                            .equalsIgnoreCase(maSach))
                            .collect(Collectors.toList());
            if(result.isEmpty()) {
                System.err.println("Ko tim thay sach voi ma :"+maSach);
            } else {
                Book book = result.get(0);
                book.update();
            }
            System.out.println("Ban co muon tiep tuc(Y/N):");
            continueOrNot = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        }
    }

    @Override
    public void showAll() {
        System.out.println("================================================================================");
        System.out.println("Danh sách sách");
        System.out.println("================================================================================");
        System.out.println("Mã sách |Tên sách | Tên tác giả | Số lượng | Danh mục");
        System.out.println("================================================================================");
        for(Book book: books) {
            System.out.println(book.toString());
        }
        System.out.println("================================================================================");
    }

    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
