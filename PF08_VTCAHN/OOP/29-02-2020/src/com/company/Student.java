package com.company;

public class Student implements Comparable, Cloneable {
    //Mot class co the thuc thi NHIEU interface
    private String email, name;
    private Integer age;
    //private int age;
    //muon so sanh 2 sinh vien voi nhau ?
    //phai co TIEU CHI so sanh
    //so sanh 2 sinh vien(Student), co tieu chi: so sanh theo tuoi(age),
    // theo ten, theo thu tu email
    //constructor

    public Student(String name, String email, Integer age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        //compare to tra ve gia tri -1, 1, 0
        return this.age.compareTo(((Student)o).age);
        //return  this.age - ((Student)o).age;
        //return this.name.compareTo(((Student)o).name);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        }catch (CloneNotSupportedException error) {
            return null;
        }

    }
}
