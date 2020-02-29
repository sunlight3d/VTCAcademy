package com.company;


public interface IAnimal {
    //interface ko the ke thua 1 class
    //chua phan KHAI BAO phuong thuc
   public void bawl(); //ko chua phan thuc thi
    //phuong thuc ko the la "private", "protected"
    //Khai bao phuong thuc static co ton tai trong interface ? KO
    //Neu ton tai phai co phan thuc thi
    public static void doSomthing() {
        //it dung
    }
    //IAnimal() {} //Interface KO chua ham khoi tao
}
