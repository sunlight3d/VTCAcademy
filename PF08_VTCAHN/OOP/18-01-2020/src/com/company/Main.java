package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        //test Phan so
        PhanSo phanSo1 = new PhanSo(1,2);
        PhanSo phanSo2 = new PhanSo(3,8);
        PhanSo phanSo3 =  phanSo1.cong(phanSo2);
        phanSo3.show();
        System.out.println("phanso so 1 nho hon ps2 ? "+!phanSo1.lonHon(phanSo2));
        Rectangle r1 = new Rectangle("red", "hcn", 100.0, 200.0);
        r1.show();
    }
}
