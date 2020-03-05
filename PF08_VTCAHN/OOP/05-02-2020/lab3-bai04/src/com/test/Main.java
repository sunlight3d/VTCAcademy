package com.test;

import com.vtclab.EnglishNumberToWords;
import com.vtclab.EnglishTranslator;
import com.vtclab.NumberTranslator;
import com.vtclab.VietnameseTranslator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab03 - bai4");
        /*
        Tren thuc te, de lam da ngon ngu(multi-language)
        co cac file resource. VD: en.json, vn.json
        trong cac file nay se chua thong tin:
        file tieng anh
        "hello" = "hello";
        "how are you ?" = "how are you ?";
        file tieng viet:
        "hello" = "xin chao";
        "how are you ?" = "ban khoe ko ?";
        Bai tap 4 de minh luyen interface
        * */
        NumberTranslator englishTranslator = new EnglishTranslator();
//        System.out.println(englishTranslator.getNumber("nine"));
        System.out.println(englishTranslator.getNumber("xx"));
        //neu minh truyen string "xx" => ko lay dc gia tri
        NumberTranslator vietmeseTranslator = new VietnameseTranslator();
        System.out.println(vietmeseTranslator.getString(15));

        System.out.println(EnglishNumberToWords.convert(120_000));
        //ham convert la static
    }
}
