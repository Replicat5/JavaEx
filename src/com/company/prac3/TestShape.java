package com.company.prac3;

public class TestShape {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        Square square = new Square(3);
        triangle.area();
        square.area();
    }
}
