package lab3.bai01;

public class Ellipse extends Hinh {
    private double trucLon, trucNho;

    public Ellipse(String ten, double trucLon, double trucNho) {
        super(ten);
        this.trucLon = trucLon;
        this.trucNho = trucNho;
    }

    public double getTrucLon() {
        return trucLon;
    }

    public double getTrucNho() {
        return trucNho;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * trucLon * trucNho;
    }
    @Override
    public double tinhChuVi() {
        return Math.PI * (3 * (trucLon + trucNho)
                - Math.sqrt((3*trucLon + trucNho) * (trucLon + 3* trucNho)));
    }
}
