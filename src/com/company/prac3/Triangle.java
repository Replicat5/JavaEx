package com.company.prac3;

public class Triangle extends Shape{
    private double a,b,c,p,s;

    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void area() {
        p = (a + b + c)/2;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        String sts = Double.toString(s);
        System.out.println("Площадь треугольника равна : " + sts);
    }
}
