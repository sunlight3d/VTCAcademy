package com.company;

public class DoanThang {
    private Diem diemA;
    private Diem diemB;

    public DoanThang(Diem diemA, Diem diemB) {
        this.diemA = diemA;
        this.diemB = diemB;
    }
    public void show(){
        System.out.println("x1 = "+diemA.getX()+
                "\nx2 = "+diemB.getX()+
                "\ny1 = "+diemA.getY()+
                "\ny2 = "+diemB.getY());
    }
    public Boolean isParallel(DoanThang doanThang) {
        Double k1 = (this.diemA.getX() - this.diemB.getX())
                /(doanThang.diemA.getX() - doanThang.diemB.getX());
        Double k2 = (this.diemA.getY() - this.diemB.getY())
                /(doanThang.diemA.getY() - doanThang.diemB.getY());
        return Math.abs(k1) == Math.abs(k2);
    }
    public Double getDistance() {
        return Math.sqrt(Math.pow(diemA.getX() - diemB.getX(), 2) +
                Math.pow(diemA.getY() - diemB.getY(), 2));
    }
    public Diem getMidPoint() {
        return new Diem((diemA.getX()+diemB.getX())/2,
                        (diemA.getY()+diemB.getY())/2);
    }
    public Diem getDiemA() {
        return diemA;
    }

    public void setDiemA(Diem diemA) {
        this.diemA = diemA;
    }

    public Diem getDiemB() {
        return diemB;
    }

    public void setDiemB(Diem diemB) {
        this.diemB = diemB;
    }
}
