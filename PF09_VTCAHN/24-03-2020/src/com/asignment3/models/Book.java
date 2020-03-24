package com.asignment3.models;

import com.asignment3.controllers.BookManagement;
import com.asignment3.controllers.FileManagement;

import java.util.regex.Pattern;

public class Book extends Model{

    private String maSach, tenSach, tenTacGia, danhMuc;
    private Integer soLuong = 0;
    public Book() {
        maSach = "";
        tenSach = "";
        tenTacGia = "";
        danhMuc = "";
    }
    @Override
    public void input() {
        //Má sách bắt đầu bằng chữ B, sau đó là 2 số => regex
        Boolean validateMaSach = Book.validateMaSach(this.maSach);
        while(validateMaSach == false) {
            System.out.println("- Nhập mã sách:");
            this.maSach = getScanner().nextLine();
            validateMaSach = Book.validateMaSach(this.maSach);
        }
        System.out.println("- Nhập tên sách:");
        this.tenSach = getScanner().nextLine();

        System.out.println("- Nhập tên tác giả:");
        this.tenTacGia = getScanner().nextLine();

        System.out.println("- Nhập số lượng:");
        this.soLuong = getScanner().nextInt();

        System.out.println("- Nhập danh muc:");
        this.danhMuc = getScanner().nextLine();
    }

    @Override
    public void update() {
        System.out.println("- Sửa tên sách:");
        String tenSach = getScanner().nextLine();

        System.out.println("- Sửa tên tác giả:");
        String tenTacGia = getScanner().nextLine();

        System.out.println("- Sửa số lượng:");
        Integer soLuong = getScanner().nextInt();

        System.out.println("- Sửa danh muc:");
        String danhMuc = getScanner().nextLine();

        System.out.println("Ban co muon cap nhat(Y/N):");
        Boolean save = getScanner().nextLine().equalsIgnoreCase("y") ? true : false;
        if(save ==  true) {
            this.tenSach = tenSach;
            this.tenTacGia = tenTacGia;
            this.soLuong = soLuong;
            this.danhMuc = danhMuc;
            System.out.println("Thông tin đã được cập nhật!");
        }
    }

    public static Boolean validateMaSach(String maSach) {
        Pattern pattern = Pattern.compile("^B[0-9]{1,2}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(maSach).matches();
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return String.format("%8s", maSach) +
                String.format("%10s", tenSach) +
                String.format("%8s", tenTacGia) +
                String.format("%8d", soLuong) +
                String.format("%8s", danhMuc);
    }
}
