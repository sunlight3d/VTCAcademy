package com.asignment3.models;

import java.util.regex.Pattern;

public class MemberCard extends Model {
    private String maThe;
    private String tenChuThe;
    private String soCMND;//co regex: 10 so, cac so tu 0-9, so dau tien khac 0

    public static Boolean validateSoCMND(String soCMND) {
        Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{9}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(soCMND).matches();
    }

    public MemberCard() {
        this.maThe = "";
        this.tenChuThe = "";
        this.soCMND = "";
    }

    @Override
    public void input() {
        System.out.println("- Nhập mã thẻ:");
        this.maThe = getScanner().nextLine();

        System.out.println("- Nhập tên chủ thẻ:");
        this.tenChuThe = getScanner().nextLine();

        Boolean validateSoCMND = MemberCard.validateSoCMND(this.soCMND);
        while(validateSoCMND == false) {
            System.out.println("- Nhập số CNND: ");
            this.soCMND = getScanner().nextLine();
            validateSoCMND = Book.validateMaSach(this.soCMND);
        }
    }

    @Override
    public void update() {
        System.out.println("- Sửa tên chủ thẻ:");
        this.tenChuThe = getScanner().nextLine();

        Boolean validateSoCMND = MemberCard.validateSoCMND(this.soCMND);
        while(validateSoCMND == false) {
            System.out.println("- Sửa số CNND: ");
            this.soCMND = getScanner().nextLine();
            validateSoCMND = Book.validateMaSach(this.soCMND);
        }
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getTenChuThe() {
        return tenChuThe;
    }

    public void setTenChuThe(String tenChuThe) {
        this.tenChuThe = tenChuThe;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
}
