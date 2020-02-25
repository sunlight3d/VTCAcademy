package com.company;

public class Sach extends SanPham{
    //Sách có thêm thông tin số trang
    //nghia la class Sach ke thua tu SanPham, va co them thuoc tinh soTrang
    private int soTrang;
    //Phuong thuc khoi tao cua lop sach
    Sach() {}
    public Sach(String tenSanPham, String motaSanPham,
                String nhaSanXuat, Float giaBan,
                int soTrang) {
        //super = "SanPham"
        //Goi phuong thuc khoi tao(constructor) cua lop cha
        super(tenSanPham, motaSanPham, nhaSanXuat, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSach{" +
                "soTrang=" + soTrang +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
    }
}
