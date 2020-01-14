package com.company;

public class Calculation {
    public Integer sum(Integer x, Integer y) {
        return x + y;
    }
    public Integer minus(Integer x, Integer y) {
        return x - y;
    }
    public Integer multiply(Integer x, Integer y) {
        return x * y;
    }
    public Integer divide(Integer x, Integer y) {
        return y != 0 ?  x / y : 0;
    }
}
