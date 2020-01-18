package com.company;

public class PhanSo {
    private Integer tuso; //int = kieu so nguyen "primitive"(nguyen thuy), scalar
    private Integer mauso;
    //phuong thuc khoi tao ko tham so = default constructor
    PhanSo(){
        tuso = 0;
        mauso = 1;
        PhanSo.soLuong++;//trong 1 phuong thuc instance(ko phai static) thi co the truy
        //cap vao thuoc tinh static
    }
    public void show() {
        System.out.println(this.tuso + "/" + this.mauso);
    }
    public static Integer soLuong = 0;
    public PhanSo(Integer tuso, Integer mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public static Integer uscln(Integer a, Integer b){
        //this.tuso = 10;//trong 1 phuong thuc static => chi goi dc thuoc tinh/phuong thuc
        //static khac
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        Integer kq = a == 0 ? b : a;
        return kq == 0 ? 1 : kq;
    }
    public PhanSo cong(PhanSo p) {
        PhanSo ketqua = new PhanSo();
        ketqua.setTuso(this.tuso * p.getMauso() + p.getTuso()*this.mauso);
        ketqua.setMauso(this.mauso * p.getMauso());
        ketqua.rutGon();
        return ketqua;
    }
    public PhanSo tru(PhanSo p) {
        PhanSo ketqua = new PhanSo();
        ketqua.setTuso(this.tuso * p.getMauso() - p.getTuso()*this.mauso);
        ketqua.setMauso(this.mauso * p.getMauso());
        ketqua.rutGon();
        return ketqua;
    }
    //tru nhan chia, tu lam
    public Boolean lonHon(PhanSo p) {
        PhanSo phanSoHieu = this.tru(p);
        Float hieu = (float) phanSoHieu.getTuso()/(float) phanSoHieu.getMauso();
        return  hieu > 0.0f;
    }
    public PhanSo rutGon() {
        //instance method
        Integer uscln = PhanSo.uscln(tuso, mauso);
        this.tuso /= uscln;
        this.mauso /= uscln;
        return this;
    }
    public Integer getTuso() {
        return tuso;
    }

    public void setTuso(Integer tuso) {
        this.tuso = tuso;
    }

    public Integer getMauso() {
        return mauso;
    }

    public void setMauso(Integer mauso) {
        this.mauso = mauso;
    }
}
