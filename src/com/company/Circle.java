package com.company;

public class Circle extends Figure{

    Circle(double size1, double size2) {
        super(size1, size2);
    }


    @Override
    public double Area() {
        return Math.PI * (getSize1()*getSize1());
    }
}
