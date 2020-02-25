package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Viet class mai chan roi, viet menu
        int choice = 0;
        System.out.println("1. Them san pham ");
        System.out.println("2. Xoa san pham ");
        //....
        System.out.println("7. Thoat ");
        //Bay gio test thu cai menu nay !
        while (choice != 7) {
            System.out.println("Moi ban chon 1 - 7:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Them san pham");
                    break;
                case 2:
                    System.out.println("Xoa san pham");
                    break;
                case 3:
                    System.out.println("Cap nhat san pham");
                    break;
                case 4:
                    System.out.println("Tim kiem san pham");
                    break;
                case 5:
                    System.out.println("Sap xep san pham");
                    break;
                case 6:
                    System.out.println("Xem danh sach san pham");
                    break;
                case 7:
                    System.out.println("Thoat");
                    break;
            }
        }
    }
}
