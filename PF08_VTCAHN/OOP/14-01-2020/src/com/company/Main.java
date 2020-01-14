package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	/*
	    System.out.println("Hello world");
	    Calculation c1 = new Calculation();
	    Integer sum = c1.sum(2, 3);
	    System.out.println("Tong 2 va 3 = "+sum);
	    Integer tich = c1.multiply(2,3);
        System.out.println("Tich 2 va 3 = "+tich);
        //Goi ham constructor => luon dung "new"
		Rectangle r1 = new Rectangle();
		//Vi du ve nhap du lieu tu ban phim(scanf in C)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gia tri cua x = ");
		Integer x = scanner.nextInt();
		System.out.println("Nhap gia tri cua y = ");
		Integer y = scanner.nextInt();
		Calculation c3 = new Calculation();
		Integer tong = c3.sum(x, y);
		System.out.println("Tong x va y la : "+tong);
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ban nhap may sinh vien ? ");
		Integer N = scanner.nextInt();
		for(int i = 0; i < N; i++) {
			//Nhap thong tin tung nguoi mot
			System.out.println("Thong tin nguoi thu "+(i+1));
			Student student = new Student();
			System.out.println("Ten sinh vien : ");
			scanner = new Scanner(System.in);
			student.setName(scanner.nextLine());
			System.out.println("Da tot nghiep chua(y or n)? : ");
			scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if(answer.equals("y")) {
				student.setGraduated(true);
			} else if(answer.equals("n")) {
				student.setGraduated(false);
			}
			student.show();
		}
    }
}
