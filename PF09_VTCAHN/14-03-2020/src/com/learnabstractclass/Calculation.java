package com.learnabstractclass;

public class Calculation {
    public static int divide2Numbers(int x, int y) throws Exception{
        //Ham tra ve exception ?
        try {
            //Validate ngay thang phai co dinh dang 20-10-2020 => dung Regular Expression = bieu thuc chinh quy
            //Validate ma lop phai dang VTC23-12
            int result = x / y;
            return result;
        } catch (Exception e ){
            throw new Exception("Ko chia duoc dau nhe");
        }
    }
}
