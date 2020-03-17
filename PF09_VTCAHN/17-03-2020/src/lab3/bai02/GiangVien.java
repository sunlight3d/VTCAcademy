package lab3.bai02;

abstract public class GiangVien {
    public static final Double THU_LAO_CO_BAN = 90_000.0;
    //la abstact hay ko ? ok vi trong nay ko viet duoc phuong thuc tinh tien luong
    //họ tên, ngày sinh, học hàm, học vị, ngày bắt đầu công tác tại trung tâm
    private String hoten;
    private String ngaySinh;
    private String hocHam;//giao su
    private String hocVi;//tien si
    private String ngayBatDauCongTac;
    private Double soGioLam;
    abstract public Double tinhLuong();

    public GiangVien(String hoten, String ngaySinh,
                     String hocHam, String hocVi,
                     String ngayBatDauCongTac,
                     Double soGioLam
    ) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.ngayBatDauCongTac = ngayBatDauCongTac;
        this.soGioLam = soGioLam;
    }

    public Double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(Double soGioLam) {
        this.soGioLam = soGioLam;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "hoten='" + hoten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", hocHam='" + hocHam + '\'' +
                ", hocVi='" + hocVi + '\'' +
                ", ngayBatDauCongTac='" + ngayBatDauCongTac + '\'' +
                ", soGioLam='" + soGioLam + '\'' +
                '}';
    }

    public GiangVien() {
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getNgayBatDauCongTac() {
        return ngayBatDauCongTac;
    }

    public void setNgayBatDauCongTac(String ngayBatDauCongTac) {
        this.ngayBatDauCongTac = ngayBatDauCongTac;
    }
}
