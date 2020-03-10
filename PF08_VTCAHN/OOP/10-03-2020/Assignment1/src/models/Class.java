package models;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class extends Human implements IStudy {
    private String classCode; //co validate, VD: F06, D301
    private String classDescription;
    private String teacherName;
    private String studyTime;//co validate dinh dang: 8h30-20h30
    private String entryDate;//2-4-6, co validate dung regex
    public Boolean isUpdate = false;
    @Override
    public void input() {
        if(isUpdate == false) {
            String classCode = "";
            while (validateClassCode(classCode) == false) {
                System.out.println("Nhập mã lớp mới:");
                classCode = getScanner().nextLine();
                if(validateClassCode(classCode) == false) {
                    System.err.println("Mã lớp chưa đúng định đạng");
                }
            }
            this.classCode = classCode;
        }

        System.out.println("Nhập mô tả lớp: ");
        this.classDescription = getScanner().nextLine();

        System.out.println("Nhập tên giảng viên: ");
        this.teacherName = getScanner().nextLine();
        this.studyTime = "";
        while (validateStudyTime(studyTime) == false) {
            System.out.println("Nhập thời gian học: ");//phai validate
            this.studyTime = getScanner().nextLine();
            if(validateStudyTime(studyTime) == false) {
                System.err.println("Thời gian học chưa đúng định đạng");
            }
        }
        this.entryDate = "";
        while (validateEntryDate(this.entryDate) == false) {
            System.out.println("Nhập ngày học(VD: 2 -4 -6): ");//phai validate
            this.entryDate = getScanner().nextLine();
            if(validateEntryDate(this.entryDate) == false) {
                System.err.println("Ngày học chưa đúng định đạng");
            }
        }

    }

    private Boolean validateEntryDate(String entryDate) {
        //Thoa man regex
        String patternString = "^([\\d]{1})[\\s]*-[\\s]*([\\d]{1})[\\s]*-[\\s]*([\\d]{1})$";
        Boolean validateRegex = entryDate.matches(patternString);
        if(validateRegex == false) {
            return false;
        }
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(entryDate);
        while(matcher.find()) {
            Integer day1 = Integer.valueOf(matcher.group(1));
            Integer day2 = Integer.valueOf(matcher.group(2));
            Integer day3 = Integer.valueOf(matcher.group(3));

            Boolean validateValue = day1 >= 2 && day1 <= 7 &&
                    day2 >= 2 && day2 <= 7 &&
                    day3 >= 2 && day3 <= 7 &&
                    !((day1 == day2) && (day1 == day3));
            return validateRegex && validateValue;
        }
        return false;
    }
    private Boolean validateStudyTime(String studyTime) {
        //Thoa man regex
        String patternString = "^([\\d]{1,2})h([\\d]{1,2})[\\s]*-[\\s]*([\\d]{1,2})h([\\d]{1,2})$";
        Boolean validateRegex = studyTime.matches(patternString);
        if(validateRegex == false) {
            return false;
        }
        //Muon validate them truong hop: gio: 0-23, phut: 0-59
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(studyTime);
        try {
            while(matcher.find()) {
                Integer startHour = Integer.valueOf(matcher.group(1));
                Integer startMinute = Integer.valueOf(matcher.group(2));
                Integer endHour = Integer.valueOf(matcher.group(3));
                Integer endMinute = Integer.valueOf(matcher.group(4));
                Boolean validateValue = startHour >= 0 && startHour <= 23 &&
                        startMinute >= 0 && startMinute <= 59 &&
                        endHour >= 0 && endHour <= 23 &&
                        endMinute >= 0 && endMinute <= 59;
                return validateRegex && validateValue;
            }
            return false;
        }catch (Exception e) {
            System.err.println(e.toString());
            return false;
        }
    }

    private Boolean validateClassCode(String code) {
        //nhap vao code la XY55 => false
        //Neu nhap vao code la F012 => true
        //Dinh dang chuan: (khoi dau bang chu F, sau do la so, toi da 3 so)
        return code.matches("^l[0-9]{0,3}$");
    }
    public Class() {}

    public Class(String classCode, String classDescription,
                 String teacherName, String studyTime, String entryDate) {
        this.classCode = classCode;
        this.classDescription = classDescription;
        this.teacherName = teacherName;
        this.studyTime = studyTime;
        this.entryDate = entryDate;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassDescription() {
        return classDescription;
    }

    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
}
