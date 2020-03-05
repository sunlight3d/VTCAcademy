package com.vtclab;

import java.util.Hashtable;
import java.util.Map;

public class EnglishTranslator implements NumberTranslator{
    @Override
    public String getString(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid";
        }
    }

    @Override
    public Integer getNumber(String str) {
        /*
        switch (str.toLowerCase()) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                return -1;
        }
        */
        //Cach 2 dung Map
        //Map = kieu du lieu co the them cac thuoc tinh bat ky, ko gioi han, giong kieu Key-Value
        //Trong javascript, co the goi la doi tuong JSON
        Map<String, Integer> map = new Hashtable<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        return map.get(str.toLowerCase()) == null ? -1 : map.get(str.toLowerCase());
    }
}
