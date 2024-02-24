package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_33_Point;

public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        double result;
        result =Math.sqrt((x)*(x)+(y)*(y));
        return result;
    }

    public double distance (Point a) {
        return Math.sqrt((a.x - x) * (a.x-x) + (a.y - y)*(a.y - y));
    }

    public double distance (int x , int y) {
        return Math.sqrt((x - this.x)* (x-this.x) + (y-this.y)*(y-this.y));
    }
}


/*
Point
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.
Write the following methods (instance methods):
•	Method named getX without any parameters, it needs to return the value of x field.
•	Method named getY without any parameters, it needs to return the value of y field.
•	Method named setX with one parameter of type int, it needs to set the value of the x field.
•	Method named setY with one parameter of type int, it needs to set the value of the y field.
•	Method named distance without any parameters, it needs to return the distance between this Point and Point (0, 0) as a double.
•	Method named distance with parameter of type Point, it needs to return the distance between this Point and the parameter Point as a double.
•	Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x, y as a double.

How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.

TEST EXAMPLE
→ TEST CODE:
1.	Point first = new Point(6, 5);
2.	Point second = new Point(3, 1);
3.	System.out.println("distance(0,0)= " + first.distance());
4.	System.out.println("distance(second)= " + first.distance(second));
5.	System.out.println("distance(2,2)= " + first.distance(2, 2));
6.	Point point = new Point();
7.	System.out.println("distance()= " + point.distance());
OUTPUT
1.	distance(0,0)= 7.810249675906654
2.	distance(second)= 5.0
3.	distance(2,2)= 5.0
4.	distance()= 0.0

NOTE: Use Math.sqrt to calculate the square root √.
NOTE: Try to avoid duplicated code.
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 7 methods.

 */