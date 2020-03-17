package lab3.bai01;

public class TamGiac extends Hinh {
    private double a, b, c;

    public TamGiac(String ten, double a, double b, double c) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double tinhDienTich() {
        Double s = this.tinhChuVi()/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }
}
