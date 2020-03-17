package lab3.bai02;

public class GiangVienCoHuu extends GiangVien {
    //Giảng viên cơ hữu có thêm thông tin lương cơ bản, hệ số lương.
    private Double luongCoBan;
    private Double heSoLuong;

    public GiangVienCoHuu(String hoten, String ngaySinh,
                          String hocHam, String hocVi,
                          String ngayBatDauCongTac,
                          Double soGioLam,
                          Double luongCoBan, Double heSoLuong) {
        super(hoten, ngaySinh, hocHam, hocVi, ngayBatDauCongTac, soGioLam);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public Double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public Double tinhLuong() {
        return getSoGioLam() * GiangVien.THU_LAO_CO_BAN + luongCoBan * heSoLuong;
    }
}
