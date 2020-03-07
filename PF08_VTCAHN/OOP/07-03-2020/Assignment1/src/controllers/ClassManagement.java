package controllers;

import models.Class;
import models.Student;

import java.util.*;
import java.util.stream.Collectors;

public class ClassManagement extends Management{

    private ArrayList<Class> classes = new ArrayList<Class>();
    public void showMenu() {
        int choice = -1;
        // 1 lop hoc co nhieu sinh vien, mot sinh vien co nhieu diem thi
        System.out.println("==================================");
        System.out.println("Quản lý lớp");
        System.out.println("1.Xem danh sách lớp");
        System.out.println("2.Cập nhật thông tin lớp");
        System.out.println("3.Thêm mới 1 lớp");
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
    public void addNewClass() {
        Class newClass = new Class();
        newClass.input();
        this.classes.add(newClass);
    }
    public void updateClass() {
        System.out.println("Nhập mã lớp: ");
        String code = this.getScanner().nextLine();
        ArrayList<Class> result = (ArrayList<Class>) this.classes.stream().filter(
                eachClass -> eachClass.getClassCode().equalsIgnoreCase(code))
                .collect(Collectors.toList());
        if(result.size() ==0){
            System.err.println("Ko tìm thấy lớp với mã: "+code);
        } else {
            System.out.println("Bạn có muốn cập nhật(Y/N): ");
            if(new Scanner(System.in).nextLine().equalsIgnoreCase("y")) {
                Class foundClass = this.classes.get(0);
                foundClass.isUpdate = true;
                foundClass.input();
                System.out.println("Thông tin dã được cập nhật");
            }
        }
    }
    public void showAllClasses() {
        System.out.println("=====================================================");
        System.out.println("Danh sách lớp");
        System.out.println("=====================================================");
        System.out.println("Mã lớp |  Mô tả | Giảng viên | Giờ học | Ngày học");
        for(Class eachClass: this.classes) {
            System.out.format("%10s %20s %30s %20s %20s",
                    eachClass.getClassCode(),
                    eachClass.getClassDescription(),
                    eachClass.getTeacherName(),
                    eachClass.getStudyTime(),
                    eachClass.getEntryDate()
            );
        }
        System.out.println("=====================================================");
    }
    //tu studentCode => Student
    public Class getClassFromClassCode(String classCode) {
        ArrayList<Class> result = (ArrayList<Class>) this.classes.stream()
                .filter(eachClass -> eachClass.getClassCode().equalsIgnoreCase(classCode))
                .collect(Collectors.toList());
        if(result.size() ==0){
            return null;
        } else {
            return result.get(0);
        }
    }
}
