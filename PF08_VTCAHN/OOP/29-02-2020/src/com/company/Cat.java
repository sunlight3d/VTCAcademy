package com.company;

//implements = thuc thi
//extends = ke thua = inherite
public class Cat implements IAnimal{
    @Override
    public void bawl() {
        System.out.println("Meo meo");
    }
}
