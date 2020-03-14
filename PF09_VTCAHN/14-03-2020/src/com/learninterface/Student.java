package com.learninterface;

public class Student implements IPlayable, ILearning{

    //Mot class co the thuc thi 1 hoac nhieu Interface
    private String name, email;
    private Integer age;

    public Student(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void goToLibrary() {
        System.out.println("Go to library");
    }

    @Override
    public void goToSchool() {
        System.out.println("Go to school");
    }

    @Override
    public void playFootball() {
        System.out.println("Go to Football");
    }

    @Override
    public void playTennis() {
        System.out.println("Play tennis");
    }
}
