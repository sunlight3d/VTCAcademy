package com.asignment3.controllers;

import com.asignment3.Main;
import com.asignment3.models.Book;
import com.asignment3.models.Model;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BookManagement  implements IManagement, Serializable {
    public static String filePath = "c:\\temp\\books.dat";
    public MemberCardManagement memberCardManagement;//ko khoi tao
    private ArrayList<Book> books = new ArrayList<>();
    private void appendBook(Book newBook) {
        getBooksFromFile().add(newBook);
        FileManagement.saveToFile(books, BookManagement.filePath);
    }
    //viet 1 getter lay books tu file
    public ArrayList<Book> getBooksFromFile() {
        ArrayList<Model> objects =  FileManagement.readFromFile(BookManagement.filePath);
        final ArrayList<Book> books = new ArrayList<>();
        try {
            for(Object object: objects) {
                if(object instanceof Book) {
                    books.add((Book) object);
                }
            }
        }catch (Exception e){
            System.err.println("Cannot getMemberCardsFromFile:"+e.toString());
        } finally {
            this.books = books;
            return books;
        }
    }
    @Override
    public void showMenu() {
        int choice = -1;
        while(choice != 0) {
            //luu file, chi goi ham luu file voi nhung thao tac insert/update/delete
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
            appendBook(newBook);
            System.out.println("Ban co muon tiep tuc(Y/N):");
            continueOrNot = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        }
        FileManagement.saveToFile(this.books, BookManagement.filePath);
    }

    @Override
    public void update() {
        System.out.println("======== Cập nhật thông tin sách ========");
        Boolean continueOrNot = true;
        while(continueOrNot == true) {
            //Má sách bắt đầu bằng chữ B, sau đó là 2 số => regex
            System.out.println("- Nhập mã sách:");
            final String maSach = getScanner().nextLine();
            ArrayList<Book> list2 = this.getBooksFromFile();
            Boolean isFound = false;
            Hashtable<Float, Float> points = new Hashtable<>();
            points.put(1.0f, 3.0f);
            points.put(2.0f, 5.0f);
            points.get(1.0f); //3.0f
            for(Book eachBook: list2) {
                if(eachBook.getMaSach().equalsIgnoreCase(maSach)) {
                    eachBook.update();
                    isFound = true;
                    break;
                }
            }
            if(isFound == false) {
                System.err.println("Ko tim thay sach voi ma :"+maSach);
            } else {
                FileManagement.saveToFile(list2, BookManagement.filePath);
            }
            System.out.println("Ban co muon tiep tuc(Y/N):");
            continueOrNot = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        }
    }

    public Boolean kiemTraConSachKhong(String maSach, String tenSach) {
        return !this.getBooksFromFile().stream()
                .filter(book -> book
                        .getMaSach().equalsIgnoreCase(maSach)
                        && book.getTenSach().equalsIgnoreCase(tenSach))
                .collect(Collectors.toList()).isEmpty();
    }

    public  Boolean muonSach(String maSach) {
        try {
            ArrayList<Book> list2 = (ArrayList<Book>) this.getBooksFromFile().stream()
                    .filter(book -> book.getMaSach().equalsIgnoreCase(maSach))
                    .collect(Collectors.toList());
            Book foundBook = (Book)(list2.get(0));
            if(foundBook.getSoLuong() <=0) {
                System.err.println("Co sach nhung nguoi khac muon roi - HET HANG");
                return false;
            }
            foundBook.setSoLuong(foundBook.getSoLuong() - 1);
            FileManagement.saveToFile(list2, BookManagement.filePath);
            return true;
        }catch (Exception e){
            System.err.println("Ko tim thay ma sach");
            return false;
        }
    }
    public void themMotQuyenSach(String maSach) {
        //tat ca nhung cho lay mang books phai lay tu filer
        //dan den => sua rat nhieu cho
        ArrayList<Book> list2 = (ArrayList<Book>)getBooksFromFile().stream()
                .filter(book -> book.getMaSach().equalsIgnoreCase(maSach))
                .collect(Collectors.toList());
        if(!list2.isEmpty()) {
            Book foundBook = getBooksFromFile().stream()
                    .filter(book -> book.getMaSach().equalsIgnoreCase(maSach))
                    .collect(Collectors.toList()).get(0);
            foundBook.setSoLuong(foundBook.getSoLuong() + 1);
            FileManagement.saveToFile(list2, BookManagement.filePath);
        }
    }
    @Override
    public void showAll() {
        System.out.println("================================================================================");
        System.out.println("Danh sách sách");
        System.out.println("================================================================================");
        System.out.println("Mã sách |Tên sách | Tên tác giả | Số lượng | Danh mục");
        System.out.println("================================================================================");
        ArrayList<Book> xx = getBooksFromFile();
        for(Book book: getBooksFromFile()) {
            System.out.println(book.toString());
        }
        System.out.println("================================================================================");
    }

    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
}
