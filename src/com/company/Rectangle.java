package com.company;

public class Rectangle {
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
}