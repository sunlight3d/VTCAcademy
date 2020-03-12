package com.excelmanagement;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bai tap doc/ghi file excel");
        //Gia su minh doc du lieu tu 1 file excel, file nay co 3 cot, diem toan ly hoa
        //tinh tong diem va luu vao cot thu 4
        ExcelManager excelManager = new ExcelManager("c:\\temp\\input.xlsx",
                "c:\\temp\\output.xlsx");
        excelManager.readFormExcelFile();
        excelManager.saveOutputToExcel();
    }
}
