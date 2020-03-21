package com.company;

import lab03.bai4.EnglishTranslator;
import lab03.bai4.INumberTranslator;
import lab03.bai4.VietnameseTranslator;
import lab3.bai03.Point2D;

public class Main {

    public static void main(String[] args) {
        Point2D p1 = new Point2D(1,1);
        p1.moveLeft();
        System.out.println("p1 = "+p1);
        //Cac doi tuong khac moi nguoi co the tu lam tiep, rat de
        //test bai Translator
        INumberTranslator vnTranslator = new VietnameseTranslator();
        System.out.println(vnTranslator.getNumber("bốn"));
        System.out.println(vnTranslator.getString(6));

        INumberTranslator enTranslator = new EnglishTranslator();
        System.out.println(enTranslator.getNumber("five"));
        System.out.println(enTranslator.getString(7));
    }
}
