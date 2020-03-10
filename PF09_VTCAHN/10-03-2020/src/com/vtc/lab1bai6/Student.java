package com.vtc.lab1bai6;

import java.util.Scanner;

public class Student {
    private static int currentIndex = 0;
    private Integer studentCode;
    private String fullName;
    private String dateOfBirth; //20-10-2000
    private String gender;
    private String address;
    private Integer math;
    private Integer physics ;
    private Integer chemistry;
    //Ma so hoc vien la so nguyen tu tang
    //Phai biet so MAX hien tai la bao nhieu
    //bien nay phai la "global" doi voi doi tuong Student
    //=> bien static = "global cua class"
    //id luon luon tang, ko bao gio lui lai
    Student() {
        currentIndex++;
        this.studentCode = currentIndex;
        this.fullName = "";
        this.dateOfBirth = "";
        this.gender = "male";
        this.address = "";
        this.math = -1;
        this.physics = -1;
        this.chemistry = -1;
    }

    public Student(String fullName,
                   String dateOfBirth, String gender,
                   String address, Integer math,
                   Integer physics, Integer chemistry) {
        currentIndex++;
        this.studentCode = currentIndex; //auto-increment, sql
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public Integer getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(Integer studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    public void inputBasics() {
        System.out.println("Enter fulname : ");
        this.fullName = this.getScanner().nextLine();

        System.out.println("Enter dbo: ");
        this.dateOfBirth = this.getScanner().nextLine();

        System.out.println("Enter gender : ");
        this.gender = this.getScanner().nextLine();

        System.out.println("Enter address : ");
        this.address = this.getScanner().nextLine();

    }
    public void inputMarks() {
        System.out.println("Enter math : ");
        this.math = this.getScanner().nextInt();

        System.out.println("Enter physics : ");
        this.physics = this.getScanner().nextInt();

        System.out.println("Enter chemistry : ");
        this.chemistry = this.getScanner().nextInt();
    }
    public void show() {
        System.out.println("Fulname : "+ this.fullName);
        System.out.println("address : "+ this.address);
        System.out.println("dateOfBirth : "+ this.dateOfBirth);
        System.out.println("gender : "+ this.gender);
        if(this.math >= 0) {
            System.out.println("math : "+ this.math);
            System.out.println("physics : "+ this.physics);
            System.out.println("chemistry : "+ this.chemistry);
        }
    }
    public Integer getSum() {
        return this.math + this.physics + this.chemistry;
    }
    public Integer getAverage() {
        return getSum() / 3;
    }
}

// this.fullName = "";
//         this.dateOfBirth = "";
//         this.gender = "male";
//         this.address = "";
//         this.math = 0;
//         this.physics = 0;
//         this.chemistry = 0;