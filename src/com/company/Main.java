package com.company;

public class Main {

    public static void main(String[] args) {
	    Rectangle a = new Rectangle(2);
	    Rectangle b = new Rectangle(3, 2);
	    Rectangle c = new Rectangle(2, 5);

        a.printRectangleKind();
        a.printArea();
        b.printRectangleKind();
        b.printArea();
        c.printRectangleKind();
        c.printArea();

        System.out.println();

        System.out.print("Фигура а и b ");
        a.isTheSameRectangle(b);

        System.out.print("Фигура b и c ");
        b.isTheSameRectangle(c);

        System.out.print("Фигура a и c ");
        a.isTheSameRectangle(c);

        System.out.println();
        Rectangle.printRectangleCount();
        Rectangle.printClassName(true);


    }
}
