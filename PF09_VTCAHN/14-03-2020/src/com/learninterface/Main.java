package com.learninterface;

class Main {
    public static void main(String[] args) {
        //co 1 class Student, co cac phuong playFootball, playTennis,...=> phuong thuc lien quan viec an choi
        //co phuong thuc gotoLibrary, gotoSchool => thuoc nhom cac phuong thuc lien quan hoc hanh
        //=> sinh ra mot cai goi la Interface
        //IPlayable x = new IPlayable();//Co the tao doi tuong tu interface ko ? KO
        //Tao doi tuong Student ? YESSSSS
        Student studentA = new Student("Hoang", "hoang@gmail.com", 18);
        IPlayable x = studentA; //Tham chieu 1 doi tuong kieu interface den 1 class thuc thi interface do ? YES
        //VD: bai toan: co 1 ham rat dai(hamX), gui du lieu len server, xong lam viec khac
        //lay du lieu xong
        //goi ham reload giao dien cua man hinhA:
        //manHinhA.reloadData()
        //new manhinhA la object cua class ManHinhA
        //sau nay manhinhB, lai viet lai hamX
        //Dung interface intefaceServer.reloadData()
        //trong do manHinhA va manHinhB thuc thi interface InterfaceServer
        //Interface co the tham chieu den doi tuong(dtuong co thuc thi interface nay) vua tao ?=> YES
        IPlayable studentB = new Student("mr A", "a@gmail.com", 20);
        //1 class co the thuc thi nhieu interface, nhung chi duoc ke thua tu 1 abstract class
        //Ko the tao doi tuong tu abstract class hoac interface
        //Ben trong Abstract class co the chua ham Constructor
        //Ben trong Interface KO the chua ham Constructor
        //Cac ham trong interface ko the chua phan thuc thi
        //Cac ham trong interface co the abstract dc ko ? YES, nhung thua(redundant)
    }
}
