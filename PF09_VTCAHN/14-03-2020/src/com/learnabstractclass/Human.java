package com.learnabstractclass;

public abstract class Human {
    public static Integer someNumber = 0;
    //class mo ta 1 nguoi noi chung
    private String name;
    private Integer age;
    //lo mo, ko biet la phuong thuc learn cu the lam gi
    //Vi: minh co Student ke thua tu Human
    //co Engineer ke thua tu Human => phuong thuc learn co the thuc thi(override)
    //Human => ko biet learn
    //Class Shape co phuong thuc tinh dien tich => chiu ko tinh duoc
    //vay phuong thuc learn cua doi tuong human goi la phuong thuc "chua hoan thien", dang do, unfinished = abstract
    //abstract => chi co khai bao ma ko co phan thuc thi
    public abstract void learn();
    //Ai ke thua thi phai thuc thi(override)
    //trong 1 abstract class thi co ham constructor hay ko? YES
    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
