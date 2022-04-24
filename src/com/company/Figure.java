package com.company;

public class Figure {
    private double size1;
    private double size2;

    Figure(double size1, double size2){
        this.size1 = size1;
        this.size2 = size2;
    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize1(int size1) {
        this.size1 = size1;
    }

    public void setSize2(int size2) {
        this.size2 = size2;
    }

    public double Area(){
        return 0;
    }


}
