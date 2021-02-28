package com.company;

public class Rectangle {
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";
    private static int createdRectangles;
    private double x;
    private double y;



    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle(double x) {
        this.x = x;
        this.y = x;
    }


    double calculateArea() {
        double z = x * y;
        return z;

    }

    public void printArea() {
        System.out.println("Площадь " + calculateArea());
    }

    public void printRectangleKind() {
        if (x == y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }
    public boolean isTheSameRectangle (Rectangle rectangle) {
        if (this.x == rectangle.x && this.y == rectangle.y) {
            System.out.println("равны");
            return true;
        } else {
            System.out.println("не равны");
            return false;
        }
    }
    static void printRectangleCount() {
        if (createdRectangles == 1){
            System.out.println(("Всего был создан " + Rectangle.createdRectangles + " прямоугольник"));
        } else {
            System.out.println(( "Всего было создано " + Rectangle.createdRectangles + " прямоугольника" ));
        }
        createdRectangles++;
    }

    static boolean printClassName(boolean printlnRussian) {
        if (printlnRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        }
        else {
            System.out.println(ENGLISH_CLASS_NAME);
        }

        return printlnRussian;
    }
}