package com.learnabstractclass;

public class Calculation {
    public static int divide2Numbers(int x, int y) throws Exception{
        //Ham tra ve exception ?
        try {
            int result = x / y;
            return result;
        } catch (Exception e ){
            throw new Exception("Ko chia duoc dau nhe");
        }
    }
}
