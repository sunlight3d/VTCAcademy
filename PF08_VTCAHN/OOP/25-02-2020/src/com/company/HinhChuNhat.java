package com.company;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    //Phuong thuc khoi tao ko co tham so = default constructor
    HinhChuNhat() {
        chieuRong = 0.0;
        chieuDai = 0.0;
    }
    //contructor = phuong thuc khoi tao = ham khoi tao
    HinhChuNhat(double dai, double rong) {
        this.chieuDai = dai;
        this.chieuRong = rong;
    }
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }
    public double tinhChuVi() {
        return 2 * (chieuRong + chieuDai);
    }
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }


    @Override
    public String toString() {
        //toString = Ham tra ve string chua thong tin cua doi tuong
        return "HinhChuNhat co chieu dai : " + this.chieuDai+"\n"+
                "chieu rong : " + this.chieuRong+ "\n";
    }
}
