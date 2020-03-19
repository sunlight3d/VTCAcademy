package com.asignment3.models;

import java.util.Scanner;

public abstract class Model {
    public abstract void input();
    public abstract void update();
    public Scanner getScanner() {
        //Cai nay thuc thi duoc luon nen ko can abstract
        return new Scanner(System.in);
    }
}
