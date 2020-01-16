package com.company;

public class Main {

    public static void main(String[] args) {
	    //Tao ra 2 diem
        Diem diemA = new Diem(0.0,0.0);
        Diem diemB = new Diem(1.0,1.0);
        //Tao ra 1 doan thang
        DoanThang doanAB = new DoanThang(diemA, diemB);
        doanAB.show();
        System.out.println("khoang cach ab = "+doanAB.getDistance());
        System.out.println("Trung diem AB = ");
        //doanAB.getMidPoint().show();
        Diem diemI = doanAB.getMidPoint();
        diemI.show();
        Diem diemC = new Diem(0.0, 1.0);
        Diem diemD = new Diem(1.0, 2.0);
        DoanThang doanCD = new DoanThang(diemC, diemD);
        System.out.println("Co song song ko : "+doanCD.isParallel(doanAB));
        Rectangle r1 = new Rectangle(
             new Diem(1.0, 1.0),
             new Diem(3.0, 0.0)
        );
        r1.show();
    }
}
