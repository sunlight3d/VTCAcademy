package com.learnabstractclass;

import com.learn.inheritance.Cirle;

class Main {
    public static void main(String[] args) {
        //System.out.println("Hoc ve Abstract Class trong Java");
        System.out.println("Vi du ve Exception");
        //Exception la cac error xay ra khi chuong trinh chay
        //VD: chia 1 so cho 0, goi den ham/phuong thuc cua 1 doi tuong Null
        //..truy cap vao file ko ton tai, doc du lieu tu file ko dc cap quyen
        //..nhung loi nay minh ko the if...else
        //Giong nhu minh choi Sasuke, thua o dau, nga o dau thi dung lai o do va nhay vao cho "THUA"+ di ve
        //VD1: NullPointerException : goi ham cua 1 doi tuong Null

        //Cach khac phuc => cho vao 1 khoi try...catch
        try {
            //Cirle c1 = null;
            //Neu thanh cong thi sao
            Cirle c1 = new Cirle("aa", "red", 12.0);
            c1.setColor("red");//chinh vi the nen 1 doi tuong luon luon khoi tao, ko nen de null
            int x = 10;
            int z = x / 0;
            int y = 20;
        }catch (Exception e) {
            //Ko nho NullPointerException, hay du dung Exception(cha cua NullPointerException, ...)
            System.out.println("Cannot set color, error : "+e.toString());
        } finally {
            //Khoi nay luon chui vao ke ca thanh cong hay that bai
            System.out.println("Finish try-catch");
        }
        //Neu nhay vao try-catch, thi chuong trinh ko bi thoat ra nua
        //Apple(Swift, Objective C) ko thich
        //chuogn trinh thoat ra ngoai(Exception), mac du luc bien dich ko thay Error
        //Ngoai ra: yeu cau nhap so nguyen, ban lai nhap String..
        //Viet 1 ham co tra ve exception thi lam the nao ?
        //System.out.println("Thuong cua 3 va 0 la : "+Calculation.divide2Numbers(3, 0));
        try {
            System.out.println("Thuong cua 3 va 0 la : "+Calculation.divide2Numbers(3, 0));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
