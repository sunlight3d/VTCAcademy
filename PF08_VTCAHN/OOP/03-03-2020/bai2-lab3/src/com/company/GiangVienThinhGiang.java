package com.company;

public class GiangVienThinhGiang extends GiangVien implements IGiangVien{
    private String noiCongTacHienTai;

    @Override
    public String toString() {
        return super.toString()+
                "noiCongTacHienTai='" + noiCongTacHienTai + '\'';
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Noi cong tac hien tai: ");
        this.noiCongTacHienTai = this.scanner.nextLine();
    }

    @Override
    public Double tinhLuong() {
        return getSoGioLam() * 90_000;
    }
}
