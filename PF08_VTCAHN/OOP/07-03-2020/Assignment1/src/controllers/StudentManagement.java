package controllers;

import models.Student;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StudentManagement extends Management {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<Student>();
    public Scanner getScanner() {
        return new Scanner(System.in);//fix loi nhan dau enter
    }
    public void showMenu() {
        int choice = -1;
        // 1 lop hoc co nhieu sinh vien, mot sinh vien co nhieu diem thi
        System.out.println("==================================");
        System.out.println("Quản lý danh sách sinh viên");
        System.out.println("1.Xem danh sách sinh viên");
        System.out.println("2.Cập nhật thông tin sinh viên");
        System.out.println("3.Thêm mới 1 sinh viên");
        System.out.println("0.Thoát");
        while (choice != 0) {
            System.out.print("Mời bạn chọn(0-3) : ");
            choice = scanner.nextInt();
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
    public void addNewStudent() {
        Student student = new Student();
        student.input();
        this.students.add(student);
    }
    public void updateStudent() {
        System.out.println("Nhập mã sinh viên: ");
        String code = this.scanner.nextLine();
        //Tim xem co sinh vien nay ko
        ArrayList<Student> result = (ArrayList<Student>) this.students.stream().filter(student -> {
            return student.getCode().equalsIgnoreCase(code);
        }).collect(Collectors.toList());
        if(result.size() ==0){
            System.err.println("Ko tìm thấy sinh viên với mã: "+code);
        } else {
            Student student= result.get(0);
            System.out.println("Nhập tên sinh viên: ");
            String name = this.scanner.nextLine();
            System.out.println("Nhập địa chỉ sinh viên: ");
            String address = this.scanner.nextLine();
            System.out.println("Nhập ngày sinh: ");
            String dateOfBirth = this.scanner.nextLine();
            System.out.println("Bạn có muốn cập nhật(Y/N): ");
            if(new Scanner(System.in).nextLine().equalsIgnoreCase("y")) {
                student.setName(name);
                student.setAddress(address);
                student.setDateOfBirth(dateOfBirth);
                System.out.println("Thông tin dã được cập nhật");
            } 
        }
    }
    public void showAllStudents() {
        System.out.println("=====================================================");
        System.out.println("Danh sách sinh viên");
        System.out.println("=====================================================");
        System.out.println("Mã SV |  Họ và tên | Địa chỉ | Ngày sinh | Lớp");
        for(Student student: this.students) {
            System.out.format("%10s %20s %30s %20s %20s",
                                student.getCode(),
                                student.getName(),
                                student.getAddress(),
                                student.getDateOfBirth(),
                                student.getClass()
                    );
        }
        System.out.println("=====================================================");

    }
    //tu studentCode => Student
    public Student getStudentFromStudentCode(String studentCode) {
        ArrayList<Student> result = (ArrayList<Student>) this.students.stream()
                .filter(student -> student.getCode().equalsIgnoreCase(studentCode))
                .collect(Collectors.toList());
        if(result.size() ==0){
            return null;
        } else {
            return result.get(0);
        }
    }
}
