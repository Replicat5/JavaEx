package com.company.prac3;

public class Square extends Shape{
    private double side;

    Square(double side){
        this.side = side;
    }
    @Override
    public void area() {
        double s = side * side;
        String sts = Double.toString(s);
        System.out.println("Площадь квадрата равна : " + sts);
    }
}
