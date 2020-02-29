package com.company;

public class Main {

    public static void main(String[] args) {
	    //test
        //Tao ra cac doi tuong hinh chu nhat
        Rectangle rectangleA = new Rectangle("ABCD", 10.0, 20.0);
        //Tao ra 1 doi tuong shape ?
        //Shape shapeA = new Shape();//ko the tao 1 doi tuong tu abstract class
        Shape shapeA = rectangleA; //ok
        Shape shapeB = new Rectangle("EFGH", 5.0, 10.0);
        //Tao ra cac doi tuong Cat, Dog, Pig
        Cat mimi = new Cat();
        mimi.bawl();
        //IAnimal x = new IAnimal(); //ko the tao duoc doi tuong tu interface
        IAnimal myDog = new Dog(); //ok
        //de y chut
        IAnimal y = new IAnimal() {
            @Override
            public void bawl() {

            }
        };
        //Tao ra 2 doi tuong Student
        Student studentA = new Student("Hoang",
                "hoang@gmail.com", 18);
        Student studentB = new Student("BBB",
                "hoang@gmail.com", 20);
        //if(studentA > studentB) //NO
        if(studentA.compareTo(studentB) > 0) {
            System.out.println("A nhieu tuoi hon B");
        } else if(studentA.compareTo(studentB) < 0) {
            System.out.println("A it tuoi hon B");
        } else {
            System.out.println("A bang tuoi B");
        }
        //Nhan ban(clone) 1 doi tuong =
        // = "tao ra 1 doi tuong khac co thong tin giong het doi tuong cu"
        //1.Nhan ban bang tay(manual)
        //VD: tao ra 2 sinh vien du lieu giong het nhau:
        Student studentC = new Student("CC", "cc@gmail.com", 25);
        Student studentD = new Student(studentC.getName(),
                studentC.getEmail(),
                studentC.getAge());
        //test
        //studentC va studentD giong nhau ve du lieu, khac nhau ve dia chi
        //== studentD nhan ban tu studentC
        //Neu Student co...100 fields(truong) => cach nay Ko OK
        //Dung ham clone
        Student studentE = (Student) studentC.clone();// cach nay co the clone duoc
        //doi tuong bat ky, mien la class cua doi tuong do phai
        // thuc thi(override) phuong thuc clone

        //Tai vi clone() la phuong protected, chi goi duoc trong Student hoc
        //con cua Student, trong Main.java KO goi duoc
        //De goi duoc, phai override 1 phuong thuc public clone trong Student
        System.out.println("Haha");
        //Polimophism = da hinh thai
        //nhieu objects co ten phuong thuc giong nhau, ket qua thuc thi khac nhau
        //VD: hinh chu nhat va hinh tron(class Circle) cung co phuong thuc getArea()
        //nhung cong thuc KHAC NHAU
    }
}
