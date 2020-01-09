package com.company;

public class Main {
    public static void main(String[] args) {
	    System.out.println("Chao cac ban");
	    Diem diemA = new Diem(0.0f, 0.0f);
        Diem diemB = new Diem(1.0f, 1.0f);
        Diem diemC = diemA;
        //diemA.setX(120.0f);
        diemA.hienthongtin();
        System.out.println("Khoang cach = "+diemA.tinhKhoangCach(diemB));

    }
    static Integer sum(Integer x, Integer y) {
        return x + y;
    }
}
