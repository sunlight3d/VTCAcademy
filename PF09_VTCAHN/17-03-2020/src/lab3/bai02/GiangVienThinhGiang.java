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

    @Override
    public Double tinhLuong() {
        return getSoGioLam() * GiangVien.THU_LAO_CO_BAN;
    }
}
