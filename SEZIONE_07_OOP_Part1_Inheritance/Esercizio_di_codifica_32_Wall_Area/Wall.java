package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_32_Wall_Area;

public class Wall {

    private double width;
    private double height;

    public Wall () {

    }

    public Wall (double width, double height) {
        if (width < 0.0) {
            width = 0.0;
        }
        if (height < 0.0) {
            height = 0.0;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0.0);
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0.0);
    }

    public double getArea () {
        return width * height;
    }
}


/*
Wall Area
Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.

The class needs to have two constructors:
•	The first constructor does not have any parameters (no-args constructor).
•	The second constructor has parameters width and height of type double and it needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0.
In case the height parameter is less than 0 it needs to set the height field value to 0.

Write the following methods (instance methods):
•	Method named getWidth without any parameters, it needs to return the value of width field.
•	Method named getHeight without any parameters, it needs to return the value of height field.
•	Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
•	Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
•	Method named getArea without any parameters, it needs to return the area of the wall.

TEST EXAMPLE
→ TEST CODE:
1.	1 Wall wall = new Wall(5,4);
2.	2 System.out.println("area= " + wall.getArea());
3.	3
4.	4 wall.setHeight(-1.5);
5.	5 System.out.println("width= " + wall.getWidth());
6.	6 System.out.println("height= " + wall.getHeight());
7.	7 System.out.println("area= " + wall.getArea());

→ OUTPUT:
1.	area= 20.0
2.	width= 5.0
3.	height= 0.0
4.	area= 0.0

NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 5 methods and 2 constructors.

 */