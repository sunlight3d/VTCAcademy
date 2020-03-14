package com.lab2.bai03;

public class Sach extends SanPham {
    private Integer soTrang;
    public Sach() {}
    public Sach(String maSanPham,
                String tenSanPham,
                String motaSanPham,
                String nhaSanXuat,
                Float giaBan,
                Integer soTrang
                ) {
        super(maSanPham, tenSanPham, motaSanPham, nhaSanXuat, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap soTrang");
        this.soTrang = getScanner().nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "soTrang=" + soTrang;
    }
}
