package com.learnabstractclass;

public class Engineer extends Human {
    private String job;
    //Neu 1 class ke thuc tu 1 abstract class thi
    //class nay BAT BUOC phai thuc thi cac phuong thuc abstract ben trong class do
    @Override
    public void learn() {
        //super.learn();//Ko can thiet, thua, vi lop CHA ko THUC THI
        System.out.println("I am learning");
    }
    public Engineer(String name, Integer age, String job) {
        super(name, age);
        this.job = job;
    }
}
