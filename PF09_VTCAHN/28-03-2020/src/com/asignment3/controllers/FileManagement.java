package com.asignment3.controllers;

import com.asignment3.models.Model;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileManagement {
    //Moi lan goi FileManagement, tao ra 1 doi tuong management moi
    //Ma doi tuong nay ko co properties
    //Chuyen cac phuong thuc static
    public static Boolean saveToFile(Object objects, String filePath) {
        try {
            //mo file va ghi them vao, ko duoc xoa du lieu cu
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(objects);
            out.close();
            fileOut.close();
            System.out.println("Save file to "+filePath+"successfully");
            return true;
        } catch (Exception e) {
            System.err.println("Save file to "+filePath+"failed: "+e.toString());
            return false;
        }
    }
    public static ArrayList<Model> readFromFile(String filePath){
        ArrayList<Model> objects = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object list = in.readObject();
            if(list instanceof ArrayList<?>) {
                for(Object item: (ArrayList<?>)list) {
                    if(item instanceof Model) {
                        objects.add((Model) item);
                    }
                }
            }
            in.close();
            fileIn.close();
            //convert tu Stream sang arraylist
        } catch (Exception e) {
            System.err.println("Read from file "+filePath+"failed: "+e.toString());
        } finally {
            return objects;
        }
    }
}
