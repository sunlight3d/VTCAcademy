package com.company;

public class Student {
    private String name;
    private Boolean graduated;
    //getter
    public String getName(){
        return name;
    }
    //setter = ham thay doi gia tri 1 thuoc tinh
    void setName(String name) {
        this.name = name;
    }
    public Boolean isGraduated(){
        return graduated;
    }
    //setter
    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }
    public void show() {
        String result = (graduated == true) ? "roi" : "chua";
        System.out.println("Name : "+this.name+", graduated : "+result);
    }
}
