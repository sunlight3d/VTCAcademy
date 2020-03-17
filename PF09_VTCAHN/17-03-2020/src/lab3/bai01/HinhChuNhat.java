package lab3.bai01;

public class HinhChuNhat extends Hinh {
    private double chieuDai, chieuRong;

    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    //Trong Java ko co quy tac dat ten cho Interface va Abstract
    //Tuy nhien trong C# hay dat ten Interface co chu I. VD IEnumerable
    //Lam the nao de biet no la abstract,  khi ke thua no se bao loi,
    // kiem tra thay co 1 so phuogn thuc phai implement(TRU contructor)
    //Abtract class ocon dung de chua nhieu kieu du lieu khac nhau trong 1 array list
    //List<Engineer va Student>, List<Human>
    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
}
