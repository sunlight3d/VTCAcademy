package com.company;

public class Ellipse extends Hinh {
    private Double trucLon, trucNho;

    public Ellipse(String ten, Double trucLon, Double trucNho) {
        super(ten);
        this.trucLon = trucLon;
        this.trucNho = trucNho;
    }

    @Override
    public Double tinhDienTich() {
        return Math.PI * trucLon * trucNho;
    }

    @Override
    public Double tinhChuVi() {
        return Math.PI * (3 * (trucNho + trucLon)-
                Math.sqrt((3*trucNho + trucLon) * (trucNho + 3*trucLon)));
    }

    public Double getTrucLon() {
        return trucLon;
    }

    public void setTrucLon(Double trucLon) {
        this.trucLon = trucLon;
    }

    public Double getTrucNho() {
        return trucNho;
    }

    public void setTrucNho(Double trucNho) {
        this.trucNho = trucNho;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "ten: "+super.getTen()+
                "trucLon=" + trucLon +
                ", trucNho=" + trucNho +
                '}';
    }
}
