package controllers;

import java.util.Scanner;

public class Management {
    private Scanner scanner = new Scanner(System.in);
    public Scanner getScanner() {
        return new Scanner(System.in);//fix loi nhan dau enter
    }

}
