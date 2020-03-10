package com.vtc.lab1;

public class PhanSo {
    //int = dang nguyen thuy = primitive,uu diem: toc do tinh toan nhanh
    //nhuoc diem: ko ho tro cac ham lien quan den class Integer
    private int tuSo; //thuoc tinh = property = field = attribute
    private int mauSo; //thuoc tinh = property = field = attribute
    private int soLuong;
    //Thong thuong, nguoi ta hay de cac thuoc tinh la private, truy cap cac thuoc tinh thong qua cac phuong thuc/ham "public"
    //=> tinh dong goi = Encapsulation
    //default constructor = phuong thuc khoi tao mac dinh = ham khoi tao mac dinh
    //= constructor without parameters
    PhanSo() {} //constructor co dac diem: ten giong het ten class
    //constructor with parameters = phuong thuc khoi tao co tham so/bien
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public PhanSo rutGon() {
        int uscln = this.uscln(this.tuSo, this.mauSo);
        //Neu phan so ket qua chinh la phan so ban dau\
        this.tuSo /= uscln;
        this.mauSo /= uscln;
        return this;
        //Phan so rut gon la 1 phan so khac, doc lap voi anh nay,it thuc te hon
        //return new PhanSo(this.tuSo/uscln, this.mauSo/uscln);
    }
    public PhanSo cong(PhanSo p) {
        //Gia tri tra ve la 1 phan so khac, doc lap voi phan so ban dau
        int tuSoMoi = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * p.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }
    public PhanSo tru(PhanSo p) {
        int tuSoMoi = this.tuSo * p.mauSo - p.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * p.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }
    public PhanSo nhan(PhanSo p) {
        int tuSoMoi = this.tuSo * p.tuSo ;
        int mauSoMoi = this.mauSo * p.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }
    public PhanSo chia(PhanSo p) {
        int tuSoMoi = this.tuSo * p.mauSo ;
        int mauSoMoi = this.mauSo * p.tuSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }
    public byte soSanh(PhanSo p) {
        PhanSo phanSoMoi = this.tru(p);
        if(phanSoMoi.tuSo * phanSoMoi.mauSo < 0) {
            return -1;
        } else if(phanSoMoi.tuSo * phanSoMoi.mauSo > 0) {
            return 1;
        }
        return 0;
    }
    public void hienThi() {
        System.out.println("Tu so = "+this.tuSo);
        System.out.println("Mauso = "+this.mauSo);
    }
    //getter = cac phuong thuc public de lay ra gia tri cac thuoc tinh tuong ung
    //Neu 1 thuoc tinh chi co getter => thuoc tinh nay la "read-only"
    public int getTuSo() {
        return tuSo;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getMauSo() {
        return mauSo;
    }
    //setter = cac phuong thuc publie cho phep thay doi gia tri 1 thuoc tinh(property)
    //1 thuoc tinh co ca getter + setter => read/write
    //1 thuoc tinh ko co getter VA ko co setter => thuoc tinh nay goi la "hidden"
    //1 thuoc tinh private + 2 phuong thuc getter/setter  => tinh dong goi(Encapsulation) (Java, C#)
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    //uscln
    public int uscln(int a, int b) {
        //uscln cua a va b la gia tri ma ca a, b deu chia het cho no
        while (a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}
