package com.asignment3.models;

public class Book extends Model{
    private String maSach, tenSach, tenTacGia, danhMuc;
    private Integer soLuong = 0;
    Book() {
        maSach = "";
        tenSach = "";
        tenTacGia = "";
        danhMuc = "";
    }
    @Override
    public void input() {
        //Má sách bắt đầu bằng chữ B, sau đó là 2 số => regex
        System.out.println("- Nhập mã sách:");
        Boolean validateMaSach = validateMaSach();
        while(validateMaSach == false) {
            this.maSach = getScanner().nextLine();
            validateMaSach = validateMaSach();
        }
        System.out.println("- Nhập tên sách:");
        this.tenSach = getScanner().nextLine();

        System.out.println("- Nhập tên tác giả:");
        this.tenTacGia = getScanner().nextLine();

        System.out.println("- Nhập danh muc:");
        this.danhMuc = getScanner().nextLine();

    }
    public Boolean validateMaSach() {
        return true;
    }
}
