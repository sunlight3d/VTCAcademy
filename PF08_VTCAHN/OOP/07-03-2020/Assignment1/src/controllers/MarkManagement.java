package controllers;

import models.*;
import models.Class;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MarkManagement extends Management{

    private ArrayList<Mark> marks = new ArrayList<Mark>();
    
    public void showMenu() {
        int choice = -1;
        System.out.println("==================================");
        System.out.println("Quản lý điểm thi");
        System.out.println("1.Nhập điểm thi");
        System.out.println("2.Hiển thị điểm thi theo lớp");
        System.out.println("3.Hiển thị điểm thi theo môn");
        System.out.println("0.Trở về menu chính");
        while (choice != 0) {
            System.out.print("Mời bạn chọn(0-3) : ");
            choice = getScanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ban chon 1");
                    break;
                case 2:
                    System.out.println("Ban chon 2");
                    break;
                case 3:
                    System.out.println("Ban chon 3");
                    break;
            }
        }
    }
    public void addNewMark() {
        Mark newMark = new Mark();
        newMark.input();
        this.marks.add(newMark);
    }

    public void showMarkesByClass() {
        System.out.println("=====================================================");
        System.out.println("Điểm thi theo lớp");
        System.out.println("=====================================================");
        System.out.println("Mã lớp |  Tên sinh viên | Môn thi | Điểm | Đánh giá");
        System.out.println("Nhập mã lớp : ");
        String classCode = this.getScanner().nextLine();
        for(Mark eachMark: this.marks) {
            Class eachClass = (new ClassManagement()).getClassFromClassCode(classCode);
            if(classCode == null) {
                continue;
            }
            Student eachStudent = (new StudentManagement()).getStudentFromStudentCode(eachMark.getStudentCode());
            if(eachStudent == null) {
                continue;
            }
            String studentName = eachStudent.getName();
            String subject = eachMark.getSubject();
            Float point = eachMark.getPoint();
            String estimate = point < 5 ? "Trượt" : "Đỗ";
            System.out.format("%10s %20s %30s %20.1f %20s",
                    classCode,
                    studentName,
                    subject,
                    point,
                    estimate
            );
        }
        System.out.println("=====================================================");
    }
}

