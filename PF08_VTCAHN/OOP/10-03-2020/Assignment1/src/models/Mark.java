package models;

import controllers.StudentManagement;

import java.util.Scanner;

public class Mark extends Human implements IStudy {
    private String studentCode, subject;
    private Float point;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void input() {
        this.studentCode = "";
        while (validateStudentCode(this.studentCode) == false) {
            System.out.println("Nhập mã sinh viên:");
            this.studentCode = getScanner().nextLine();
            if(validateStudentCode(this.studentCode) == false) {
                System.err.println("Mã sinh viên chưa đúng định đạng");
            }
        }

        System.out.println("Nhập môn học: ");
        this.subject = getScanner().nextLine();

        Float point = -1.0f;
        while (point < 0.0 || point > 10.0) {
            System.out.println("Nhập điểm: ");
            point = getScanner().nextFloat();
            if(point < 0.0 || point > 10.0) {
                System.err.println("Điểm phải trong khoảng từ 1 đến 10");
            } else {
                this.point = point;
            }
        }

    }
    public Boolean validateStudentCode(String studentCode) {
        return StudentManagement.getInstance()
                .getStudentFromStudentCode(studentCode) != null;
    }
    public Mark() { }

    public Mark(String studentCode, String subject, Float point) {
        this.studentCode = studentCode;
        this.subject = subject;
        this.point = point;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }
}
