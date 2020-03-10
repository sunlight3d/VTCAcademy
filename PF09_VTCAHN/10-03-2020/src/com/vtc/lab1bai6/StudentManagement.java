package com.vtc.lab1bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    public void inputStudents() {
        System.out.println("Enter number of students: ");
        Integer numberOfStudents = this.getScanner().nextInt();
        for(int i = 0; i < numberOfStudents; i++) {
            //Ham nhap thong tin tung doi tuong,
            //Cong viec nay la cua Student, de thang student lam
            Student newStudent = new Student();
            newStudent.inputBasics();
            this.students.add(newStudent);
        }
    }
    public void inputMarks() {
        for(Student student: this.students) {
            student.inputMarks();
        }
    }
    public void showAllStudents() {
        for(Student student: this.students) {
            student.show();//viec show thong tin tung student la cong viec cua Student
        }
    }
    public void findStudentsByStudentCode() {
        System.out.println("Enter student's code to find: ");
        Integer studentCode = this.getScanner().nextInt();
        //cach 1: tim kiem kieu co dien(thuc te thi dung ham filter va bieu thuc lambda)
        ArrayList<Student> foundStudents = new ArrayList<>();
        for(Student student: this.students) {
            if(student.getStudentCode() == studentCode) {
                foundStudents.add(student);
            }
        }
        //In ra ket qua
        for(Student student: foundStudents) {
            student.show();
        }
    }
    public void sortByTotalMarks() {
        //Hoi sort theo chieu nao
        System.out.println("Ban sap sep tang dan(0), hay giam dan(1) : ");
        Integer direction = getScanner().nextInt();
        if(direction == 0) {
            this.students.sort((studentA, studentB) -> studentA.getSum().compareTo(studentB.getSum()));
        } else if(direction == 1) {
            this.students.sort((studentA, studentB) -> studentB.getSum().compareTo(studentA.getSum()));
        }
        this.showAllStudents();

    }
    public void giveScholarShips() {
        //Hoi sort theo chieu nao
        System.out.println("Enter average marks to get scholarship");//VD: 8
        Integer minMark = getScanner().nextInt();
        ArrayList<Student> foundStudents = new ArrayList<>();
        for(Student student: this.students) {
            if(student.getAverage() >= minMark) {
                foundStudents.add(student);
            }
        }
        //In ra ket qua
        if(foundStudents.size() == 0) {
            System.out.println("Nobody get scholarships");
        } else {
            System.out.println("List of students who get scholarships :");
            for(Student student: foundStudents) {
                student.show();
            }
        }
    }


}
