package com.learninterface;

//Interface co the private, protected ? NO
public interface IPlayable {
    public void playFootball();//chi co khai bao, ko co phan thuc thu thi
    public void playTennis(); //chi duoc phep default va public, ko dc private, protected
    //public String name;//Ben trong interface co the chua thuoc tinh ko ? NO
    public static Integer something = 1;//TRong interface co the chua thuoc tinh static ko ? YES

}
