package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Triangle properties: ");
        Figure figureTriangle = new Triangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter Rectangle properties: ");
        Figure figureRectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Enter Circle properties: ");
        Figure figureCircle = new Circle(scanner.nextDouble(), 0);


        Figure[] figures = new Figure[3];
        figures[0] = figureTriangle;
        figures[1] = figureRectangle;
        figures[2] = figureCircle;
        double max = 0;
        for (int i = 1; i < figures.length; i++) {
            if (figures[i].Area() > max){
                max = figures[i].Area();
            }
        }

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Figure number " + (i+1) + "'s area: " + figures[i].Area());
        }
        double sum = 0;
        for (Figure figure : figures) {
            sum = sum + figure.Area();
        }
        System.out.println("Average of figures' areas: " + (sum / Figure.counter));


        System.out.println("Area of largest figure: " + max);
        System.out.println("Number of Figures: " + Figure.counter);
    }
}
