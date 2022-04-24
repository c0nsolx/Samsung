package com.company;

public class Triangle extends  Figure{

    Triangle(double size1, double size2) {
        super(size1, size2);
    }

    @Override
    public double Area() {
        return (getSize1() * getSize2()) / 2;
    }
}
