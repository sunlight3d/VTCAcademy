package com.excelmanagement;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExcelManager {
    //Luu diem thi vao 1 doi tuong Diem co cac thuoc tinh: toan, ly, hoa ? cach nay da lam nhieu
    //Hom nay minh gioi thieu 1 cach khac, minh su dung doi tuong Map, Hashtable
    //Doi tuong dang Map cho phep chung ta luu cac thuoc tinh kem gia tri tuong ung, bao nhieu thuoc tinh cung duoc
    //ko can dinh nghia class
    //gia tri theo cap: Key-Value
    private ArrayList<Map<String, Float>> marks = new ArrayList<Map<String, Float>>();
    private String inputFileName;
    private String outFileName;

    public ExcelManager(String inputFileName, String outFileName) {
        this.inputFileName = inputFileName;
        this.outFileName = outFileName;
    }

    public void readFormExcelFile() {
        //Gia su la minh chon sheet1
        try {
            //Tai sao phai try-catch : co the file excel ko ton tai de doc, ko co quyen xem, co mat khau,...
            FileInputStream file = new FileInputStream(new File(inputFileName));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            //Get first/desired sheet from the workbook
            XSSFSheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = firstSheet.iterator();
            Integer rowIndex = 0;
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                if(rowIndex == 0) {
                    rowIndex++;
                    continue;
                }
                if(row.getCell(1) == null) {
                    break;
                }
                Float diemToan = (float)row.getCell(1).getNumericCellValue();
                Float diemLy = (float)row.getCell(2).getNumericCellValue();
                Float diemHoa = (float)row.getCell(3).getNumericCellValue();
                Float tongDiem = diemToan + diemLy + diemHoa;
                Float trungBinh = (diemToan + diemLy + diemHoa) / 3;
                //Da doc du lieu ok, gio phai cho du lieu do vao ben trong arraylist
                if(rowIndex > 7) {
                    System.out.println("haaha");
                }
                Map<String, Float> mark = new HashMap<>();
                mark.put("diemToan", diemToan);
                mark.put("diemLy", diemLy);
                mark.put("diemHoa", diemHoa);
                mark.put("tongDiem", tongDiem);
                mark.put("trungBinh", trungBinh);
                this.marks.add(mark);
                rowIndex++;
                System.out.println("");
            }
            file.close();
        }catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    public void saveOutputToExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        //Create a blank sheet
        XSSFSheet firstSheet = workbook.createSheet("Ket qua");
        int rownum = 0;
        Row row = firstSheet.createRow(rownum++);
        row.createCell(0).setCellValue("Toan");
        row.createCell(1).setCellValue("Ly");
        row.createCell(2).setCellValue("Hoa");
        row.createCell(3).setCellValue("Tong");
        row.createCell(4).setCellValue("Trung binh");
        for(Map<String, Float> mark: this.marks) {
            row = firstSheet.createRow(rownum++);
            row.createCell(0).setCellValue(mark.get("diemToan"));
            row.createCell(1).setCellValue(mark.get("diemLy"));
            row.createCell(2).setCellValue(mark.get("diemHoa"));
            row.createCell(3).setCellValue(mark.get("tongDiem"));
            row.createCell(4).setCellValue(mark.get("trungBinh"));
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File(this.outFileName));
            workbook.write(out);
            out.close();
            System.out.println(this.outFileName+" written successfully on disk.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
