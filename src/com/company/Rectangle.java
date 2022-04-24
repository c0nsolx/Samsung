package com.company;

public class Rectangle extends Figure {

    Rectangle(double size1, double size2) {
        super(size1, size2);
    }

    @Override
    public double Area() {
        return getSize1() * getSize2();
    }
}
