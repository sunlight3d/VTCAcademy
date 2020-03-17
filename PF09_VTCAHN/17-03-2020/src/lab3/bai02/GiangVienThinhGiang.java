package lab3.bai02;

public class GiangVienThinhGiang extends GiangVien {
    private String noiCongTac;
    public GiangVienThinhGiang(String hoten,
                               String ngaySinh,
                               String hocHam,
                               String hocVi,
                               String ngayBatDauCongTac,
                               Double soGioLam,
                               String noiCongTac) {
        super(hoten, ngaySinh, hocHam, hocVi, ngayBatDauCongTac, soGioLam);
        this.noiCongTac = noiCongTac;
    }

    GiangVienThinhGiang() {}

    @Override
    public Double tinhLuong() {
        return getSoGioLam() * GiangVien.THU_LAO_CO_BAN;
    }
    @Override
    public void input() {
        super.input();
        System.out.println("Nhap noi cong tac : ");
        this.noiCongTac = getScanner().nextLine();

    }

    @Override
    public String toString() {
        return super.toString()  +
                "noiCongTac='" + noiCongTac + "\n";
    }
}
