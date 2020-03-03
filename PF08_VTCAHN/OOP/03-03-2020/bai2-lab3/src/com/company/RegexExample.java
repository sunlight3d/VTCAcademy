package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    private String testString = "ji je ja je\n" +
            "mijiji \n" +
            "\n" +
            "hoang \n" +
            "kewej haofihj@gmail.com\n" +
            "\n" +
            "jijiew \n" +
            "emwkje wi\n" +
            "\n" +
            "hoang23XX\n" +
            "abc@gmail.com\n" +
            "\n" +
            "ek,wolew";
    //Day la String de test, lat nua chung ta se doc thu tu 1 file text
    //Bai kho hon, cho text vao trong file, doc ra
    private String patternString = "([a-zA-Z]+@[\\w]+\\.[a-zA-Z]{1,3})";
    private String xyPattern = "x[\\s]*=[\\s]*([\\d]+\\.[\\d]*)[\\s]*y[\\s]*=[\\s]*([\\d]+\\.[\\d]*)";
    //test bang tay ok, moi cho day viet code
    public void checkEmailInAString() {
        ArrayList<String> emails = new ArrayList<>();
        Pattern pattern = Pattern.compile(this.patternString, Pattern.CASE_INSENSITIVE);
        this.testString = readTextFromFile(
                "C:\\Users\\User\\Documents\\code\\VTCAcademy\\" +
                        "PF08_VTCAHN\\OOP\\03-03-2020\\bai2-lab3\\src\\com\\company\\data.txt");
        Matcher matcher = pattern.matcher(testString);
        while (matcher.find()){
            emails.add(matcher.group(0));
        }
        if(emails.size() > 0) {
            System.out.println("Tim thay dia chi email trong text");
            emails.forEach(email -> {
                System.out.println(email);
            });
        }
    }
    public void getXYFromText() {
        ArrayList<Point> points = new ArrayList<>();
        //Test bang Sublime text
        Pattern pattern = Pattern.compile(this.xyPattern,
                Pattern.CASE_INSENSITIVE);
        this.testString = readTextFromFile(
                "C:\\Users\\User\\Documents\\code\\VTCAcademy\\" +
                        "PF08_VTCAHN\\OOP\\03-03-2020\\bai2-lab3\\src\\com\\company\\dataXY.txt");
        Matcher matcher = pattern.matcher(testString);
        while (matcher.find()){
            Double x = Double.valueOf(matcher.group(1));
            Double y = Double.valueOf(matcher.group(2));
            //Nem vao danh sach cac doi tuong Point
            points.add(new Point(x, y));
        }
        //Gio minh cho ket qua vao file excel nhe ?
        //Dang don gian nhat la dung csv
        try (PrintWriter out = new PrintWriter("c:\\temp\\dataXY.csv")) {
            for(Point point: points) {

                out.println(point.getX()+","+point.getY()+","
                        +point.getSum());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public String readTextFromFile(String fileName) {
        Path path = Paths.get(fileName);
        String result = "";
        try {
            Scanner scanner = new Scanner(path);
            System.out.println("Read text file using Scanner");
            while(scanner.hasNextLine()){
                //process each line
                String line = scanner.nextLine();
                result += line;
            }
            scanner.close();
            System.out.println("Read data from file successfully");
            return result;
        }catch (IOException e) {
            System.out.println("Cannot read data. Error : "+e.toString());
            return result;
        }
    }
}
