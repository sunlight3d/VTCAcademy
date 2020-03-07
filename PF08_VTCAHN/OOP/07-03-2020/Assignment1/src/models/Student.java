package models;

import java.util.Scanner;

public class Student extends Human implements IStudy{

    private String code, name, address, dateOfBirth;
    private String classCode;

    //Gia su ma sinh vien co dang F012(khoi dau bang chu F, sau do la so, toi da 3 so)
    //validate su dung regex ?
    //Vi class nao cung co ham input => viet interface

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void input() {

        String code = "";
        while (validateStudentCode(code) == false) {
            System.out.println("Nhập mã sinh viên: ");
            code = getScanner().nextLine();
            if(validateStudentCode(code) == false) {
                System.err.println("Mã sinh viên chưa đúng định đạng");
            }
        }
        this.code = code;
        System.out.println("Nhập tên sinh viên: ");
        this.name = getScanner().nextLine();
        System.out.println("Nhập địa chỉ sinh viên: ");
        this.address = getScanner().nextLine();
        System.out.println("Nhập ngày sinh: ");
        this.dateOfBirth = getScanner().nextLine();

        System.out.println("Nhập mã lớp: ");
        this.classCode = getScanner().nextLine();
    }
    private Boolean validateStudentCode(String code) {
        //nhap vao code la XY55 => false
        //Neu nhap vao code la F012 => true
        //Dinh dang chuan: (khoi dau bang chu F, sau do la so, toi da 3 so)
        return code.matches("^f[0-9]{0,3}$");
    }
}
