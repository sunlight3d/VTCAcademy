package lab3.bai02;

import java.util.Scanner;

abstract public class GiangVien {
    public static final Integer GIANG_VIEN_CO_HUU = 0;
    public static final Integer GIANG_VIEN_THINH_GIANG = 1;
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    public static final Double THU_LAO_CO_BAN = 90_000.0;
    //la abstact hay ko ? ok vi trong nay ko viet duoc phuong thuc tinh tien luong
    //họ tên, ngày sinh, học hàm, học vị, ngày bắt đầu công tác tại trung tâm
    private String hoten;
    private String ngaySinh;
    private String hocHam;//giao su
    private String hocVi;//tien si
    private String ngayBatDauCongTac;
    private Double soGioLam = 0.0;
    abstract public Double tinhLuong();
    public void input() {
        System.out.println("Nhap ho ten : ");
        this.hoten = getScanner().nextLine();

        System.out.println("Nhap ngay sinh : ");
        this.ngaySinh= getScanner().nextLine();

        System.out.println("Nhap hoc ham: ");
        this.hocHam = getScanner().nextLine();

        System.out.println("Nhap hoc vi : ");
        this.hocVi = getScanner().nextLine();

        System.out.println("Nhap ngay bat dau cong tac : ");
        this.ngayBatDauCongTac = getScanner().nextLine();

    }

    public GiangVien() {}
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
        String soGioLam = this.soGioLam > 0.0 ? (", soGioLam='" + this.soGioLam) : "";
        return "GiangVien{" +
                "hoten='" + hoten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", hocHam='" + hocHam + '\'' +
                ", hocVi='" + hocVi + '\'' +
                ", ngayBatDauCongTac='" + ngayBatDauCongTac + '\'' +
                soGioLam +"\n";
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
