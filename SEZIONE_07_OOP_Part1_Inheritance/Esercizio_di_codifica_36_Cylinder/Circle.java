package SEZIONE_07_OOP_Part1_Inheritance.Esercizio_di_codifica_36_Cylinder;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0.0) {
            radius = 0.0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
