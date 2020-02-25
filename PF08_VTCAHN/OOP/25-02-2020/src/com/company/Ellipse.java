package com.company;

public class Ellipse {
    //parent class = super class = lop cha
    private double bkTrucLon;
    private double bkTrucNho;
    //contructor = ham khoi tao
    //default constructor = ham khoi tao mac dinh = "ham khoi tao ko co tham so"
    Ellipse() {
        this.bkTrucNho = 0.0;
        this.bkTrucLon = 0.0;
    }
    //Ham khoi tao co ten trung ten class
    Ellipse(double bkLon, double bkNho) {
        this.bkTrucLon = bkLon;
        this.bkTrucNho = bkNho;
    }
    public double tinhDienTich() {
        //getter
        return Math.PI * bkTrucLon * bkTrucNho;
    }
    public  double tinhChuVi() {
        //sqrt = squared root = can bac 2
        //Tinh theo cong thuc Ramanujan
        return Math.PI * (3 * (bkTrucLon + bkTrucNho) -
                Math.sqrt((3 * bkTrucLon + bkTrucNho) * (bkTrucLon + 3 * bkTrucNho)));
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    protected void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    public double getBkTrucNho() {
        return bkTrucNho;
    }

    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }
    //Ghi de phuong thuc = override method
    //override: lop cha co phuong thuc nay roi, lop con viet lai


    @Override
    //De show thong tin chi tiet cua doi tuong, chung ta phai thuc thi ham toString()
    public String toString() {
        return "Ellipse's detail: \n" +
                "bkTrucLon=" + bkTrucLon + "\n"+
                "bkTrucNho=" + bkTrucNho + "\n";
                // \n = returN
    }

}
