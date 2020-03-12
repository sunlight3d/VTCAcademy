package com.learn.inheritance;

public class Rectangle extends Shape {
    //extends = ke thua = inherites
    //lop con duoc phep truy cap vao cac thuoc tinh/phuong thuc public/protected/default cua lop cha
    private Double width, height;

    public Rectangle(String name, String color, Double width, Double height) {
        super(name, color);//duoc phep truy cap constructor cua lop cha, vi: constructor cua lop cha la public
        //super la "this" cua lop cha
        this.width = width;
        this.height = height;
    }
    public void doSomething() {
        System.out.println("Ten cua hinh chu nhat la:"+super.getName()); //Neu viet this.getName() se nham lan neu o lop con co phuong thuc nay
    }

    @Override //Annotation, ngoai @Override ra con co Deprecated, @SuppressWarning, @Nonnull
    public String getName() {
        return super.getName().toUpperCase();
    }
    //Ngoai overrice
    @Deprecated
    @SuppressWarnings("Please use doTaskB instead")
    public void doTaskA() {
        System.out.println("This is task A");
    }
    public void doTaskB() {
        System.out.println("This is task A");
    }

    //Ngoai cac method tren Rectangle con co cac phuong thuc dac trung RIENG:
    public Double getArea() {
        //tinh dien tich hinh chu nhat, phuong thuc nay thi thang Shape ko co
        //=> ko Override
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return super.toString()+
                "width=" + width + "\n"+
                "height=" + height + "\n";
    }
}
