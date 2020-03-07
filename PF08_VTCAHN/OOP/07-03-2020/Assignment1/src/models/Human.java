package models;

import java.util.Scanner;

public class Human {
    //Ten goi nay chua dung lam, Human la "1 class cha cua Student, Mark, Class"
    private Scanner scanner = new Scanner(System.in);
    public Scanner getScanner() {
        return new Scanner(System.in);//fix loi nhan dau enter
    }
}
